package ie.atu.tractormanager;

import java.util.Arrays;

public class TractorManager {
    private Tractor[] tractors;
    private int count;

    public TractorManager(int max) {
        tractors = new Tractor[max]; // fixed size array
        count = 0;
    }

    // Try to add a tractor to the array
    public boolean addTractor(Tractor t) {
        if (count < tractors.length) {
            tractors[count] = t;
            count++;
            return true;
        }
        return false; // array is full
    }

    // Delete tractor by VIN
    public boolean deleteTractor(String vin) {
        for (int i = 0; i < count; i++) {
            if (tractors[i].getVin().equals(vin)) {
                // Shift everything after it left
                for (int j = i; j < count - 1; j++) {
                    tractors[j] = tractors[j + 1];
                }
                tractors[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    // Find a tractor by VIN
    public Tractor findTractor(String vin) {
        for (int i = 0; i < count; i++) {
            if (tractors[i].getVin().equals(vin)) {
                return tractors[i];
            }
        }
        return null;
    }

    // Return how many tractors are stored
    public int countTractors() {
        return count;
    }

    // Print all tractors
    public void listAllTractors() {
        if (count == 0) {
            System.out.println("No tractors found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(tractors[i]);
            }
        }
    }

    // List tractors sorted by VIN
    public void listTractorsByVin() {
        if (count == 0) {
            System.out.println("No tractors to sort.");
            return;
        }

        // Make a copy of the filled portion of the array
        Tractor[] sorted = Arrays.copyOf(tractors, count);
        Arrays.sort(sorted, (a, b) -> a.getVin().compareToIgnoreCase(b.getVin()));

        for (Tractor t : sorted) {
            System.out.println(t);
        }
    }

    // Run maintenance on every tractor
    public void performMaintenanceOnAll() {
        for (int i = 0; i < count; i++) {
            tractors[i].performMaintenance();
        }
    }
}
