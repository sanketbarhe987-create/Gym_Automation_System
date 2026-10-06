package Gym_Automation_System;


public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    private static int productCount = 0;

    public static final double MIN_PRICE = 1.0;

    public Product(String productName, double price, int quantity) {

        productCount++;

        this.productId = productCount;
        this.productName = productName;

        setPrice(price);
        setQuantity(quantity);
    }


    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {

        if (price >= MIN_PRICE) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {

        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void displayProduct() {

        System.out.println("----- Product Details -----");

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    public void displayProduct(boolean showQuantity) {

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);

        if (showQuantity) {
            System.out.println("Quantity: " + quantity);
        }
    }

    public double calculateTotal() {

        return price * quantity;
    }

    public double calculateTotal(int requiredQuantity) {

        return price * requiredQuantity;
    }

    public static int getProductCount() {

        return productCount;
    }
}