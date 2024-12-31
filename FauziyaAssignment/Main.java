package com.fauziya;

public class Main{
    public static void main(String[] args){

        System.out.println("Greetings! Welcome to our Java application. This is an educational project. Let's dive in!");

        Car car = new Car("Crossover789", "Lexus UX 300h", 65, true);
        Motorcycle motorcycle = new Motorcycle("Speedster", "Kawasaki Ninja", 40, 3);
        Truck truck = new Truck("PickupMaster", "Chevrolet Silverado", 80, 12);

        // Register vehicles with the rental agent and a customer
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Mrs. Fauziya Alhassan");

        // Add vehicle to rental agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Rent a vehicle
        agency.rentVehicle("Sedan123", client, 7);

        // Handle vehicle return 
        agency.returnVehicle("Sedan123");



    }
}