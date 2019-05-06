public class Banking {

    private int accountNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNum;

    public Banking(){
        this(2, 0.00, "default name", "default email", "default phone");
        System.out.println("Empty Constructor");
    }

    public Banking(int accountNumber, double balance, String custName, String email, String phoneNum){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Banking(String custName, String email, String phoneNum){
        this(3, 0.00, custName, email, phoneNum);
    }

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

    public void printAll(){
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
        System.out.println(getCustName());
        System.out.println(getEmail());
        System.out.println(getPhoneNum());
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
