package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Barcelona", "New York"));
        flights.add(new Flight("Paris", "Pekin"));
        return flights;
    }
}