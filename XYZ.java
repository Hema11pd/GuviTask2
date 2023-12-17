package GuviTask2;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }


        int maxPriceProductIndex = findMaxProduct(products);
        System.out.println("Product with the highest price (PID): " + products[maxPriceProductIndex].pid);


        double totalAmountSpent = CTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        scanner.close();
    }


    private static int findMaxProduct(Product[] products) {
        int maxIndex = 0;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > products[maxIndex].price) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    private static double CTotalAmount(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getTotalAmountSpent();
        }
        return totalAmount;
    }
}
