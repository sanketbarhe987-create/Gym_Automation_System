package Gym_Automation_System;


public class Admin extends User implements GymOperations {

    private String adminRole;

    public Admin(String name, int age, String mobile,
                 String alternativeMobile, String address,
                 String email, String adminRole) {

        super(name, age, mobile, alternativeMobile, address, email);

        this.adminRole = adminRole;
    }

    @Override
    public void displayUserDetails() {

        System.out.println("----- Admin Details -----");
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mobile: " + getMobile());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("Role: " + adminRole);
    }

    @Override
    public void performRole() {

        System.out.println("Admin manages the gym system.");
    }

    @Override
    public void registerUser() {

        System.out.println("Admin can register new users.");
    }

    @Override
    public void updateProfile() {

        System.out.println("Admin profile updated.");
    }

    public void viewProfile() {

        System.out.println("Admin can view profile.");
    }
}