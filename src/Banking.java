public class Banking {

    private int accountNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNum;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustName() {
        return custName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void depositFunds(double amount){
        this.balance += amount;
    }

    public void withdrawFunds(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient Funds");
            return;
        }

        this.balance -= amount;
    }
}
