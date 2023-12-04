import java.util.Random;
public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumberBuilder = new StringBuilder();
        accountNumberBuilder.append("BE");
        for (int i = 0; i < 10; i++) {
            accountNumberBuilder.append(random.nextInt(10));
        }
        return accountNumberBuilder.toString();
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Storting succesvol. Nieuw balans: " + balance);
        } else {
            System.out.println("Ongeldig stortingsbedrag. Voer een positieve waarde in.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Opnamebedrag voltooid. Nieuw Balans: " + balance);
        } else {
            System.out.println("Ongeldig opnamebedrag of onvoldoende saldo.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Nummer: " + accountNumber);
        System.out.println("Balans: " + balance);
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0);
        myAccount.displayAccountInfo();
    }
}