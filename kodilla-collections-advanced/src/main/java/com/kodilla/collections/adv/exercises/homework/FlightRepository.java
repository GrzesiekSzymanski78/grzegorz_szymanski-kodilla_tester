package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> getFlightTable = new ArrayList<>();
        getFlightTable.add(new Flight("Warsaw", "Prague"));
        getFlightTable.add(new Flight("Berlin", "Paris"));
        getFlightTable.add(new Flight("Barcelona", "New York"));
        getFlightTable.add(new Flight("Paris", "Pekin"));
        return getFlightTable;
    }
}