import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    BankDatabase bankDatabase = new BankDatabase();

    public void displayMessage(){
        System.out.println("-------------------------------------\n");
        System.out.println("------Welcome To Mjiyakho Bank-------\n");
        System.out.println("         How we can help you\n"+
                            "         1.Open an account\n"+
                            "         2.Check balance\n"+
                            "         3.Deposite cash\n"+
                            "         4.Withdraw cash");
        
        System.out.println("-------------------------------------");
    }


    private void openAccount(){
        OpenAccount openAccount = new OpenAccount();
        openAccount.createAccount(bankDatabase);
    }

    public void checkBalance(List<ClientAccount> listClientsAccount, String cardNumber){
        for(ClientAccount clientAccount: listClientsAccount){
            if(clientAccount.getCardNumber().equals(cardNumber)){
                System.out.println("Your balance is "+ clientAccount.getBalance());
                return;
            }
        }
        System.out.println("Invalid card number");
    }

    public void runBank() {
        while (true) {
            displayMessage();
            System.out.print("Enter your choice: ");
            
            try {
                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        openAccount();
                        break;
                    case "2":
             
                        System.out.print("Enter your card number: ");
                        String cardNumber = scanner.nextLine();
                        checkBalance(bankDatabase.getListClientAccounts(), cardNumber);
                        break;
                    case "3":
                        // Implement deposit cash
                        break;
                    case "4":
                        // Implement withdraw cash
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (NoSuchElementException e) {
                // Handle the exception, e.g., display an error message
                System.out.println("Error reading user input. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.runBank();
    }
}
