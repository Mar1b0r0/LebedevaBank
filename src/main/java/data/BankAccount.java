package data;


public class BankAccount {
    private Client client;
    private String bankAccount;
    private double balance;

    public BankAccount (Client client, double balance){
        this.client = client;
        this.bankAccount = client.getCard().getCARD_NUMBER();
        this.balance = balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalance() {
        return balance;
    }
}
