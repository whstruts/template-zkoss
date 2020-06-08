package com.model;

import com.viewmodel.FoodFilter;
import com.viewmodel.LocFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocData {
    private static List<Location> locations = new ArrayList<Location>();
    static {
        locations.add(new Location("A-01-001", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-002", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-003", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-004", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-005", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-006", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-007", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-008", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-009", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-010", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-011", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-012", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-013", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-014", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-015", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-016", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-017", "OTHER", "OK", "OTHER", "AO1"));
        locations.add(new Location("A-01-018", "OTHER", "OK", "OTHER", "AO1"));
    }
    public static List<Location> getAllLocations() {
        return new ArrayList<Location>(locations);
    }
    public static Location[] getAllLocationsArray() {
        return locations.toArray(new Location[locations.size()]);
    }

    public static List<Location> getFilterLocations(LocFilter locFilter) {
        List<Location> someLocations = new ArrayList<Location>();
        String loc = locFilter.getLocation().toLowerCase();

        for (Iterator<Location> i = locations.iterator(); i.hasNext();) {
            Location tmp = i.next();
            if (tmp.getName().toLowerCase().contains(loc)) {
                someLocations.add(tmp);
            }
        }
        return someLocations;
    }
}
