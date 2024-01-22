public class ClientAccount{
    private String fullName;
    private String cardNumber;
    private int balance;


    public ClientAccount(String fullName,String cardNumber, int balance){
        this.fullName = fullName;
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }
    

}