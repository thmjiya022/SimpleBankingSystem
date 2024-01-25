import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class OpenAccount {

    private Scanner scanner;
    private Random random;
    private int balance;

    public OpenAccount(){
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.balance = 0;
    }

    public String generateCardNumber(){
        StringBuilder cardNumBuilder = new StringBuilder();
        cardNumBuilder.append(1 + this.random.nextInt(9));

        for(int i = 0; i < 15; i++){
            cardNumBuilder.append(this.random.nextInt(10));
        }
        return cardNumBuilder.toString();
    }

    public String generateCVV(){
        StringBuilder cvvBuilder = new StringBuilder();
        for(int i = 0; i < 3; i++){
            cvvBuilder.append(this.random.nextInt(10));
        }
        return cvvBuilder.toString();
    }

    public String getFullName(){
        while(true){
            try{
                System.out.println("Enter your full name");
                String userInput = this.scanner.nextLine();

                if(userInput.matches("^[a-zA-Z]+\\s[a-zA-Z]+$")){
                    return userInput;
                }else{
                    System.out.println("Invalid full name, enter your name and surname.");
                }
            }catch(Exception e){
                System.out.println("An error occurred: "+ e.getMessage());
            }
        }
    }

    public String getUsername(){
        System.out.println("\nUsername: ");
        String username = this.scanner.nextLine();


        return username;
    }

    public String getId(){
 
        while(true){
            System.out.println("Enter your ID");
            String clientId = this.scanner.nextLine();

            if(clientId.length() == 13){
                return clientId;
            }
        }
    }

    public ClientAccount createAccount(){
        System.out.println("Welcome to Mjiyakho Banking\n");
        String fullName = getFullName();
        String clientID = getId();
        String cvvNumber = generateCVV();
        String cardNumber = generateCardNumber();

 
        return new ClientAccount(fullName, cardNumber, balance);
    }

}
