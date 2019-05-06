import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Banking fred = new Banking();

        fred.setAccountNumber(1);
        fred.setBalance(500.00);
        fred.setCustName("Fred Frederson");
        fred.setEmail("fred@fred.fred");
        fred.setPhoneNum("555-555-5555");

        System.out.println("Account # = " + fred.getAccountNumber());
        System.out.println("Balance = " + fred.getBalance());
        System.out.println("Name = " + fred.getCustName());
        System.out.println("Email = " + fred.getEmail());
        System.out.println("Phone = " + fred.getPhoneNum());

    }
}
