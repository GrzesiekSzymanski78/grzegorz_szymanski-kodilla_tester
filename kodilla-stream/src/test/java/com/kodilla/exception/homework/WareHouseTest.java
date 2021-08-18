package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WareHouseTest {

    @Test
    public void testWareHouse_withOrderDoesntExistException(){
        WareHouse wareHouse = new WareHouse();
        assertThrows(OrderDoesntExistException.class,()-> wareHouse.getOrder("5"));
    }
}