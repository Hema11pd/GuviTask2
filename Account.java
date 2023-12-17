package GuviTask2;


public class Account {
    private double balance;
    public Account()
    {
         this.balance = 0.0;
    }
    public Account(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public void deposit(double amount)
    {
       if(amount >0)
       {
          balance  = balance + amount;
           System.out.println("New Balance after deposit is: " +balance);
       }
       else {
           System.out.println("Invalid deposit amount:enter positive value");
       }
    }

    public void withdraw(double amount)
    {
      if(amount >0 && amount <= balance)
      {
          balance = balance - amount;
          System.out.println("New Balance after with draw is: " + balance);
      }
      else
      {
          System.out.println("Insufficient balance");
      }
    }
 public void display()
 {
     System.out.println("Final balance:"+this.balance);
 }

    public static void main(String[] args)
    {
        Account account1 = new Account();
        account1.deposit(100);
        account1.withdraw(10);
        account1.display();
        Account account2 = new Account(10000);
        account2.deposit(1000);
        account2.withdraw(100);
        account2.display();


    }
}
