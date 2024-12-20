package Rental.vehicle.System;

public class Car extends Vehicle {
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) {
            cost += 10 * days;
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
