package Gym_Automation_System;

public class GymMember extends User implements GymOperations {

    private String membershipPlan;
    private int attendanceDays;

    // Static member count
    private static int memberCount = 0;

    // Final membership limit
    public static final int MAX_ATTENDANCE = 30;

    // Constructor
    public GymMember(String name, int age, String mobile,
                     String alternativeMobile, String address,
                     String email, String membershipPlan) {

        super(name, age, mobile, alternativeMobile, address, email);

        this.membershipPlan = membershipPlan;
        this.attendanceDays = 0;

        memberCount++;
    }

    // Getter
    public String getMembershipPlan() {
        return membershipPlan;
    }

    // Setter
    public void setMembershipPlan(String membershipPlan) {
        this.membershipPlan = membershipPlan;
    }

    public int getAttendanceDays() {
        return attendanceDays;
    }

    // Attendance
    public void markAttendance() {

        if (attendanceDays < MAX_ATTENDANCE) {
            attendanceDays++;
            System.out.println("Attendance marked successfully.");
        } else {
            System.out.println("Maximum attendance limit reached.");
        }
    }

    // Method Overloading
    public void markAttendance(int days) {

        if (days > 0 && attendanceDays + days <= MAX_ATTENDANCE) {
            attendanceDays = attendanceDays + days;
            System.out.println(days + " attendance days added.");
        } else {
            System.out.println("Invalid attendance.");
        }
    }

    // Method Overriding
    @Override
    public void displayUserDetails() {

        System.out.println("----- Gym Member Details -----");
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mobile: " + getMobile());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("Membership Plan: " + membershipPlan);
        System.out.println("Attendance Days: " + attendanceDays);
    }

    // Method Overriding
    @Override
    public void performRole() {

        System.out.println("Gym member attends gym and uses gym services.");
    }

    // Interface method
    @Override
    public void registerUser() {

        System.out.println("Member registration completed.");
    }

    // Interface method
    @Override
    public void updateProfile() {

        System.out.println("Member profile updated.");
    }

    // Interface method
    @Override
    public void viewProfile() {

        System.out.println("Member profile displayed.");
    }

    // Static method
    public static int getMemberCount() {

        return memberCount;
    }
}