package Gym_Automation_System;


public class Plan {

    private int planId;
    private String planName;
    private int duration;
    private double price;

    private static int planCount = 0;

    public static final String GYM_PLAN_TYPE = "Membership Plan";

    public Plan(String planName, int duration, double price) {

        planCount++;

        this.planId = planCount;
        this.planName = planName;
        this.duration = duration;
        this.price = price;
    }


    public int getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }


    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setDuration(int duration) {

        if (duration > 0) {
            this.duration = duration;
        }
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        }
    }

    public void displayPlan() {

        System.out.println("----- Gym Plan -----");

        System.out.println("Plan ID: " + planId);
        System.out.println("Plan Name: " + planName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Price: ₹" + price);
    }

    public void displayPlan(boolean showPrice) {

        System.out.println("Plan ID: " + planId);
        System.out.println("Plan Name: " + planName);
        System.out.println("Duration: " + duration + " months");

        if (showPrice) {
            System.out.println("Price: ₹" + price);
        }
    }

    public static int getPlanCount() {

        return planCount;
    }
}