package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getDeparture().equals(departure));
        }
        return result;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getArrival().equals(arrival)) ;
        }
        return result;
    }
}