import java.util.Random;
import java.util.Scanner;

public class OpenAccount {

    private Scanner scanner = new Scanner(System.in);

    public String generateCardNumber(){
        
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cardNumBuilder = new StringBuilder();

        Random random = new Random();

        for(int i = 0; i < 3; i++){
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            cardNumBuilder.append(randomChar);
        }

        return cardNumBuilder.toString();
    }

    public void createAccount(){
        System.out.println("Welcome to Mjiyakho Banking\n");

        System.out.println("Enter your fullname");
        String fullName = scanner.nextLine();
        int balance = 0;

        String cardNumber = generateCardNumber();
 

        BankDatabase bankDatabase = new BankDatabase();
        bankDatabase.addClient(new ClientAccount(fullName, cardNumber, balance));

        System.out.println("Account created successfully");

        scanner.close();
    }

    public static void main(String[] args) {
        OpenAccount openAccount = new OpenAccount();
        openAccount.createAccount();   
    }
}
