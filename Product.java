package GuviTask2;

class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor for Product class
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for total amount spent on a product
    public double getTotalAmountSpent() {
        return price * quantity;
    }
}

