package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> resultFrom = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getDeparture().equals(departure));
        }
        return resultFrom;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> resultTo = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getArrival().equals(arrival)) ;
        }
        return resultTo;
    }
}