package Gym_Automation_System;


public class Trainer extends User implements GymOperations {

    private String specialization;
    private int experience;
    private String[] assignedMembers;

    private static int trainerCount = 0;

    public static final int MAX_MEMBERS = 5;

    public Trainer(String name, int age, String mobile,
                   String alternativeMobile, String address,
                   String email, String specialization,
                   int experience) {

        super(name, age, mobile, alternativeMobile, address, email);

        this.specialization = specialization;
        this.experience = experience;

        assignedMembers = new String[MAX_MEMBERS];

        trainerCount++;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void assignMember(String memberName) {

        for (int i = 0; i < assignedMembers.length; i++) {

            if (assignedMembers[i] == null) {

                assignedMembers[i] = memberName;

                System.out.println(
                    memberName + " assigned to trainer."
                );

                return;
            }
        }

        System.out.println("Trainer member limit reached.");
    }

    public void displayAssignedMembers() {

        System.out.println("----- Assigned Members -----");

        for (int i = 0; i < assignedMembers.length; i++) {

            if (assignedMembers[i] != null) {

                System.out.println(
                    (i + 1) + ". " + assignedMembers[i]
                );
            }
        }
    }

    @Override
    public void displayUserDetails() {

        System.out.println("----- Trainer Details -----");

        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mobile: " + getMobile());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
    }

    @Override
    public void performRole() {

        System.out.println(
            "Trainer trains members and manages their workouts."
        );
    }

    @Override
    public void registerUser() {

        System.out.println("Trainer registered successfully.");
    }

    @Override
    public void updateProfile() {

        System.out.println("Trainer profile updated.");
    }

    @Override
    public void viewProfile() {

        System.out.println("Trainer profile displayed.");
    }

    public static int getTrainerCount() {

        return trainerCount;
    }
}