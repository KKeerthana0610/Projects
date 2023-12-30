package assignment2;

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a bank account
        BankAccount myAccount = new BankAccount("John Doe", 123456, 7000);

        // Withdraw and deposit money
        myAccount.withdraw(2000);
        myAccount.deposit(500);

        // Get the balance
        int currentBalance = myAccount.getBalance();
        System.out.println("Current balance: " + currentBalance);

        // Check minimum balance status using ternary operator
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Status: " + status);
    }


	}


