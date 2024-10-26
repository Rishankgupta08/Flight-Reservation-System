import java.util.ArrayList;
import java.util.Scanner;

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int capacity;
    private ArrayList<Passenger> passengers;
    private double fare;

    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime, int capacity, double fare) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
        this.fare = fare;
        this.passengers = new ArrayList<>();
    }

    public int availableSeats() {
        return capacity - passengers.size();
    }

    public void bookSeat(Passenger passenger) {
        if (availableSeats() > 0) {
            passengers.add(passenger);
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Fare of the journey is " + fare);
            System.out.println("Press Y/N to continue");
            String answer = sc.next().toUpperCase();
            
            if (answer.equals("Y")) {
                System.out.println("Seat booked for " + passenger.getName() + " on flight " + flightNumber);
            } else {
                System.out.println("Your ticket is not confirmed.");
            }
            
            
        } else {
            System.out.println("No available seats on flight " + flightNumber);
        }
    }

    public void displayInfo() {
        System.out.println("Flight " + flightNumber + " - " + origin + " to " + destination);
        System.out.println("Departure Time: " + departureTime + ", Arrival Time: " + arrivalTime);
        System.out.println("Available Seats: " + availableSeats());
        System.out.println("Fare: " + fare);
    }

    //! Getter method for flightNumber
    public String getFlightNumber() {
        return flightNumber;
    }
}

class Passenger {
    private String name;
    private String seatNumber;

    public Passenger(String name, String seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return name + ", Seat " + seatNumber;
    }
}

class Airport {
    @SuppressWarnings("unused")
    private String name;
    private ArrayList<Flight> flights;

    public Airport(String name) {
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displayFlights() {
        for (Flight flight : flights) {
            flight.displayInfo();
            System.out.println();
        }
    }

    //! Getter for flights list
    public ArrayList<Flight> getFlights() {
        return flights;
    }
}

public class AirportManagementSystem {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("  |                                                                |");
        System.out.println("  |              WELCOME TO QUADRATIC AIRLINES                     |");
        System.out.println("  |                                                                |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("PRESS ENTER TO CONTINUE USING THE APP");
        sc.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|                CHOOSE THE OPTION TO OPEN THE APP                   |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1: SIGNUP AS AN ADMINISTRATOR");
        System.out.println("2: LOGIN AS AN ADMINISTRATOR");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("ENTER AADHAR NUMBER: ");
            long aadhar = sc.nextLong();
            if (String.valueOf(aadhar).length() == 12) {
                System.out.println("ENTER YOUR MOBILE NUMBER: ");
                while (true) {
                    long mob = sc.nextLong();
                    if (String.valueOf(mob).length() == 10) {
                        System.out.println("Enter password: ");
                        String password = sc.next();
                        break;

                        
                    } else {
                        System.out.println("Enter a valid mobile number.");
                    }
                }
            }
        } else if (choice == 2) {
            System.out.println("ENTER YOUR MOBILE NUMBER: ");
            while (true) {
                long mob = sc.nextLong();
                if (String.valueOf(mob).length() == 10) {
                    System.out.println("Enter password: ");
                    String password = sc.next();
                    break;
                } else {
                    System.out.println("Enter a valid mobile number.");
                }
            }
        }

        sc.nextLine(); 
        System.out.println("Enter airport name: ");
        String airportName = sc.nextLine();
        Airport airport = new Airport(airportName);

        while (true) {
            System.out.println("\nAirport Management System Menu:");
            System.out.println("1. Add Flight");
            System.out.println("2. Book Seat");
            System.out.println("3. Display Flights");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            if (choice == 1) {
                System.out.println("Enter flight number: ");
                String flightNumber = sc.nextLine();
                System.out.println("Enter origin: ");
                String origin = sc.nextLine();
                System.out.println("Enter destination: ");
                String destination = sc.nextLine();
                System.out.println("Enter departure time: ");
                String departureTime = sc.nextLine();
                System.out.println("Enter arrival time: ");
                String arrivalTime = sc.nextLine();
                System.out.println("Enter capacity: ");
                int capacity = sc.nextInt();
                System.out.println("Enter the fare of the journey: ");
                double fare = sc.nextDouble();
                sc.nextLine(); 
                Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime, capacity, fare);
                airport.addFlight(flight);
                System.out.println("Flight added successfully!");
            } else if (choice == 2) {
                System.out.println("Enter flight number: ");
                String flightNumber = sc.nextLine();
                System.out.println("Enter passenger name: ");
                String passengerName = sc.nextLine();
                System.out.println("Enter your Aadhar number: ");
                long aadhar = sc.nextLong();
                sc.nextLine(); 
                if (String.valueOf(aadhar).length() == 12) {
                    System.out.println("Enter seat number: ");
                    String seatNumber = sc.nextLine();
                    for (Flight flight : airport.getFlights()) {
                        if (flight.getFlightNumber().equals(flightNumber)) {
                            Passenger passenger = new Passenger(passengerName, seatNumber);
                            flight.bookSeat(passenger);
                            break;
                        }
                    }
                } else {
                    System.out.println("Flight " + flightNumber + " not found.");
                }
            } else if (choice == 3) {
                airport.displayFlights();
            } else if (choice == 4) {
                System.out.println("Exiting Airport Management System. Have a great day!!!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        sc.close();
    }
}
