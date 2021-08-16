package com.kodilla.collections.adv.exercises.homwork;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightRepositoryTest {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightTo("Paris");
        result.add(new Flight("Warsaw","Paris"));
        result.add(new Flight("Berlin","Paris"));
        result.add(new Flight("Barcelona","Paris"));

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Paris"));
        expectedList.add(new Flight("Berlin", "Paris"));
        expectedList.add(new Flight("Barcelona", "Paris"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("Prague");
        result.add(new Flight("Prague","Warsaw"));
        result.add(new Flight("Prague","Berlin"));
        result.add(new Flight("Prague","London"));
        
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Prague", "Warsaw"));
        expectedList.add(new Flight("Prague", "Berlin"));
        expectedList.add(new Flight("Prague","London"));
        assertEquals(expectedList, result);
    }
}