package Gym_Automation_System;

public abstract class User {

 
    private int userId;
    private String name;
    private int age;
    private String mobile;
    private String alternativeMobile;
    private String address;
    private String email;

   
    private static int userCount = 0;

    public static final String GYM_NAME = "FitTrack Gym";

    public User(String name, int age, String mobile,
                String alternativeMobile, String address, String email) {

        userCount++;

        this.userId = userCount;
        this.name = name;
        setAge(age);
        setMobile(mobile);
        this.alternativeMobile = alternativeMobile;
        this.address = address;
        this.email = email;
    }


    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {

        if (mobile != null && mobile.length() == 10) {
            this.mobile = mobile;
        }
    }

    public String getAlternativeMobile() {
        return alternativeMobile;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public static int getUserCount() {
        return userCount;
    }

    public final void displayGymName() {
        System.out.println("Gym Name: " + GYM_NAME);
    }

    public abstract void displayUserDetails();

    public abstract void performRole();
}