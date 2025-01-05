package com.example.airport.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.airport.model.User; // Import the User class

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            request.setAttribute("error", "Username and Password are required!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        try {
            boolean success = saveUserToDatabase(username, password);
            if (success) {
                request.setAttribute("user", new User(username, "user@example.com")); // Example user data
                request.getRequestDispatcher("user-profile.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "Registration failed. Please try again.");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("error", "An error occurred. Please try again.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

    private boolean saveUserToDatabase(String username, String password) {
        // Replace with real database code
        return true; // Simulate success
    }
}
