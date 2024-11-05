package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    public static class Product {
        
        // Task 3: Method that takes two integers and returns their product
        public int product(int x, int y) {
            return x * y;
        }
        
        // Task 4: Overloaded method that takes three integers and returns their product
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        
        // Task 5: Overloaded method that takes two doubles and returns their product
        public double product(double x, double y) {
            return x * y;
        }
    }
    
    public static void main(String[] args) {
        // Task 2: Create an object of Product in the Main function
        Product p = new Product();
    }
}
