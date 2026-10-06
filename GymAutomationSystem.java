package Gym_Automation_System;


public class GymAutomationSystem {

    public static void main(String[] args) {

       

        Admin admin = new Admin(
                "Sanket",
                25,
                "9876543210",
                "9876543211",
                "Nashik",
                "admin@gmail.com",
                "Super Admin"
        );

        GymMember member1 = new GymMember(
                "Rahul",
                22,
                "9876543212",
                "9876543213",
                "Nashik",
                "rahul@gmail.com",
                "Premium"
        );

        GymMember member2 = new GymMember(
                "Amit",
                24,
                "9876543214",
                "9876543215",
                "Pune",
                "amit@gmail.com",
                "Basic"
        );

        Trainer trainer = new Trainer(
                "Rohit",
                30,
                "9876543216",
                "9876543217",
                "Pune",
                "rohit@gmail.com",
                "Weight Training",
                5
        );

        User[] users = {
                admin,
                member1,
                member2,
                trainer
        };

        System.out.println("\n===== ALL USERS =====");

        for (User user : users) {

            user.displayUserDetails();
            user.performRole();

            System.out.println();
        }


        GymOperations operation = admin;

        System.out.println("===== ADMIN OPERATIONS =====");

        operation.registerUser();
        operation.updateProfile();
        operation.viewProfile();


        System.out.println("\n===== ATTENDANCE =====");

        member1.markAttendance();
        member1.markAttendance(3);

        System.out.println(
                "Total Attendance: "
                + member1.getAttendanceDays()
        );


        System.out.println("\n===== TRAINER =====");

        trainer.assignMember(member1.getName());
        trainer.assignMember(member2.getName());

        trainer.displayAssignedMembers();


        Plan basic = new Plan(
                "Basic",
                1,
                999
        );

        Plan premium = new Plan(
                "Premium",
                3,
                2499
        );

        Plan vip = new Plan(
                "VIP",
                6,
                4499
        );

        Plan[] plans = {
                basic,
                premium,
                vip
        };

        System.out.println("\n===== AVAILABLE PLANS =====");

        for (Plan plan : plans) {

            plan.displayPlan();

            System.out.println();
        }


        Product bottle = new Product(
                "Gym Bottle",
                499,
                2
        );

        Product gloves = new Product(
                "Gym Gloves",
                799,
                1
        );

        Product tshirt = new Product(
                "Gym T-Shirt",
                999,
                3
        );

        Product[] products = {
                bottle,
                gloves,
                tshirt
        };

        System.out.println("\n===== GYM PRODUCTS =====");

        for (Product product : products) {

            product.displayProduct();

            System.out.println(
                    "Total Value: ₹"
                    + product.calculateTotal()
            );

            System.out.println();
        }


        System.out.println("===== SYSTEM COUNTS =====");

        System.out.println(
                "Total Users: "
                + User.getUserCount()
        );

        System.out.println(
                "Total Members: "
                + GymMember.getMemberCount()
        );

        System.out.println(
                "Total Trainers: "
                + Trainer.getTrainerCount()
        );

        System.out.println(
                "Total Plans: "
                + Plan.getPlanCount()
        );

        System.out.println(
                "Total Products: "
                + Product.getProductCount()
        );
   }
}