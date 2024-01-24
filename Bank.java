import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bank {
    private Scanner scanner;
    private BankDatabase bankDatabase;

    public Bank(){
        this.scanner = new Scanner(System.in);
        this.bankDatabase = new BankDatabase();
    }

    public void displayMessage(){
        System.out.println("-------------------------------------\n");
        System.out.println("------Welcome To Mjiyakho Bank-------\n");
        System.out.println("          1.Open an account\n"+
                           "          2.Log in");
        
        System.out.println("-------------------------------------");
    }


    private void openAccount(){
        OpenAccount openAccount = new OpenAccount();
        bankDatabase.addClient(openAccount.createAccount());

        System.out.println("Account created successfully\n");
    }

    private void logIn(){

    }

    public void checkBalance(String cardNumber){

    }

    public void runBank(){
        displayMessage();
        
        String option = this.scanner.nextLine();
        switch (option) {
            case "1" -> openAccount();
            case "2" -> logIn();
            
            default -> System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.runBank();
    }
}
