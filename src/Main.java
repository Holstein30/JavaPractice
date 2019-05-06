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

        Banking bob = new Banking();

        System.out.println(bob.getAccountNumber());
        System.out.println(bob.getBalance());
        System.out.println(bob.getCustName());
        System.out.println(bob.getEmail());
        System.out.println(bob.getPhoneNum());

        Banking jon = new Banking("Jon Snow", "jon@lord.commander", "1800thewatch");

        jon.printAll();

    }
}
