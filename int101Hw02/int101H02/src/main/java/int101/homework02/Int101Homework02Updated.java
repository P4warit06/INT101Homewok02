package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }
    static void work01Utilitor() {
        System.out.println(Utilitor.testString("Test String "));
        System.out.println(Utilitor.testPositive(67));
        System.out.println(Utilitor.computeIsbn10(853729462));
    }

    static void work02Person() {
        Person f = new Person("Person1", "sonna");
        System.out.println(f);
        Person g = new Person("Anna", "Tabous");
        System.out.println(g);
    }
    static void work03Account() {
        Person f = new Person("Person1", "sonna");
        Account bankF = new Account(f);
        Person g = new Person("Anna", "Tabous");
        Account bangG = new Account(g);
        bankF.deposit(4000);
        bangG.deposit(9000);
        bangG.withdraw(8900);
        bankF.transfer(1000, bangG);
        System.out.println(bankF);
        System.out.println(bangG);
    }
}
