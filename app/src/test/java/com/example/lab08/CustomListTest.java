package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary)); // Verify it was added

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary)); // Verify it was removed
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // An empty list should have a count of 0
        assertEquals(0, list.countCities()); // Error: countCities doesn't exist!

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // After adding one city, the count should be 1
        assertEquals(1, list.countCities());
    }

}
