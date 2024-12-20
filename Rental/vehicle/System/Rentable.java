package Rental.vehicle.System;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();

    public static void main(String[] args) {

    }
}
