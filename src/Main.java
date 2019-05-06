import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Banking fred = new Banking(1, 500.00, "Fred Frederson", "fred@fred.fred", "555-555-5555");

        System.out.println("Account # = " + fred.getAccountNumber());
        System.out.println("Balance = " + fred.getBalance());
        System.out.println("Name = " + fred.getCustName());
        System.out.println("Email = " + fred.getEmail());
        System.out.println("Phone = " + fred.getPhoneNum());

        fred.depositFunds(600);
        System.out.println("Balance = " + fred.getBalance());

        fred.withdrawFunds(800);
        System.out.println("Balance = " + fred.getBalance());

        fred.withdrawFunds(1000);
        System.out.println("Balance = " + fred.getBalance());

    }
}
