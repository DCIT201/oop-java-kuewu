package Rental.vehicle.System;
import java.util.*;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getModel().equals(model) && vehicle.isAvailable()) {
                return vehicle;
            }
        }
        return null;
    }

    public void rentVehicle(String model, Customer customer, int days) {
        Vehicle vehicle = findAvailableVehicle(model);
        if (vehicle != null) {
            vehicle.setAvailable(false);
            System.out.println("Rented " + model + " to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("No available vehicle of model " + model + ".");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Vehicle " + vehicle.getModel() + " returned.");
    }

    public static void main(String[] args) {

    }
}
