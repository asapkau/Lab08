package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    // --- hasCity test ---
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }

    // --- deleteCity tests ---
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);
        list.deleteCity(calgary);  // should fail — not implemented yet
        assertFalse(list.hasCity(calgary));
    }

}
