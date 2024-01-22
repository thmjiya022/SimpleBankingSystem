import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);

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
        openAccount.createAccount();
    }

    public void runBank(){
        String option = scanner.nextLine();

        switch (option) {
            case "1":
             openAccount();
                break;
            case "2":
                System.out.println("checking balance");
            break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.displayMessage();
        bank.runBank();
    }
}
