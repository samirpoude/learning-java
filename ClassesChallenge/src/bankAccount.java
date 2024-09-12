public class bankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int number;

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }

    public bankAccount(){
        System.out.println("empty construtor called!");
    }
// using constructors
    public bankAccount(int accountNumber, double accountBalance, String customerName, int number, String email ){
        System.out.println("Account construtor with parameters called!");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        String customerEmail = email;
        int customerPhone = number;
    }


    public int getAccountNumber(){
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void depositFund(double depositAmount){
        accountBalance+= depositAmount;
        System.out.println("Deposit of $"+ depositAmount + " made. New balance = $" + accountBalance);

    }

    public void withdrawFund(double withdrawalAmount){
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("insufficient balance. you only have "+accountBalance+" in you account.");
        }else{
            accountBalance -=withdrawalAmount;
            System.out.println("Withdrawal of $"+ withdrawalAmount + " processed, remaining balance $" + accountBalance);
        }
    }
}
