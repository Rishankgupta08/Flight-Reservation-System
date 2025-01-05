package com.example.airport.servlets;

import com.example.airport.dao.FlightDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/flights")
public class FlightServlet extends HttpServlet {
    private FlightDao flightDao = new FlightDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        flightDao.getFlights();
        resp.getWriter().write("<h1>Flights Retrieved! Check Console.</h1>");
    }
}