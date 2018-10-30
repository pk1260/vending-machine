import java.util.*;
public class vendingMachine {
    public static void main(String[] args){
        int SNICKERS = 55;
        int MILKYWAY = 65;
        int KITKAT = 50;
        int TWIX = 45;
        int kwartje, dubbletje, stuiver, cent;
        int choice = 0;
        int money = 0;
        int amount = 0;

        System.out.println("VENDING MACHINE");
        System.out.println("SNICKERS 55 cents Press 1");
        System.out.println("MILKYWAY 65 cents Press 2");
        System.out.println("KITKAT 50 cents Press 3");
        System.out.println("TWIX 45 cents Press 4");

        System.out.println("Voer uw keuze in.");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        {
            System.out.println("Werp hier uw geld in");

            money = input.nextInt();

            if (money < 25)
                System.out.println("U moet boven de 25 cents inwerpen.");
            if (money >100)
                System.out.println("U moet minder dan 100 cent inwerpen.");
            if ((money < 25) || (money > 100))
                System.exit(0);

        }
        switch(choice)

        {
            case 1:

                System.out.println("U wierp: " +money + "cent in");
                System.out.println();
                System.out.println("U selecteerde SNICKERS - .55");
                System.out.println();
                amount = money - SNICKERS;

                System.out.println("Het kost: " + amount + "cents");
                System.out.println();
                System.out.println(amount + " centjes in muntjes wordt: ");
                System.out.println();

                kwartje = amount/25;
                amount = amount % 25;
                dubbletje = amount/10;
                amount = amount % 10;
                stuiver = amount/5;
                amount = amount % 5;
                cent = amount;

                System.out.println(kwartje + " kwartje(s)");
                System.out.println();
                System.out.println(dubbletje + " dubbletje(s)");
                System.out.println();
                System.out.println(stuiver + " stuiver(s) and");
                System.out.println();
                System.out.println(cent + " centjes");
                System.out.println();
                System.out.println("Bedankt geniet van uw snack!");

                break;

            case 2:

                System.out.println("U wierp: " +money + "cent in");
                System.out.println();
                System.out.println("U selecteerde MILKEYWAY - .65");
                System.out.println();
                amount = money - MILKYWAY;

                System.out.println("Het kost: " + amount + "cents");
                System.out.println();
                System.out.println(amount + " centjes in muntjes wordt: ");
                System.out.println();

                kwartje = amount/25;
                amount = amount % 25;
                dubbletje = amount/10;
                amount = amount % 10;
                stuiver = amount/5;
                amount = amount % 5;
                cent = amount;

                System.out.println(kwartje + " kwartje(s)");
                System.out.println();
                System.out.println(dubbletje + " dubbletje(s)");
                System.out.println();
                System.out.println(stuiver + " stuiver(s) and");
                System.out.println();
                System.out.println(cent + " centjes");
                System.out.println();
                System.out.println("Bedankt geniet van uw snack!");

                break;

            case 3:

                System.out.println("U wierp: " +money + "cent in");
                System.out.println();
                System.out.println("U selecteerde KITKAT - .50");
                System.out.println();
                amount = money - KITKAT;

                System.out.println("Het kost: " + amount + "cents");
                System.out.println();
                System.out.println(amount + " centjes in muntjes wordt: ");
                System.out.println();

                kwartje = amount/25;
                amount = amount % 25;
                dubbletje = amount/10;
                amount = amount % 10;
                stuiver = amount/5;
                amount = amount % 5;
                cent = amount;

                System.out.println(kwartje + " kwartje(s)");
                System.out.println();
                System.out.println(dubbletje + " dubbletje(s)");
                System.out.println();
                System.out.println(stuiver + " stuiver(s) and");
                System.out.println();
                System.out.println(cent + " centjes");
                System.out.println();
                System.out.println("Bedankt geniet van uw snack!");

                break;

            case 4:

                System.out.println("U wierp: " +money + "cent in");
                System.out.println();
                System.out.println("U selecteerde TWIX - .45");
                System.out.println();
                amount = money - TWIX;

                System.out.println("Het kost: " + amount + "cents");
                System.out.println();
                System.out.println(amount + " centjes in muntjes wordt: ");
                System.out.println();

                kwartje = amount/25;
                amount = amount % 25;
                dubbletje = amount/10;
                amount = amount % 10;
                stuiver = amount/5;
                amount = amount % 5;
                cent = amount;

                System.out.println(kwartje + " kwartje(s)");
                System.out.println();
                System.out.println(dubbletje + " dubbletje(s)");
                System.out.println();
                System.out.println(stuiver + " stuiver(s) and");
                System.out.println();
                System.out.println(cent + " centjes");
                System.out.println();
                System.out.println("Bedankt geniet van uw snack!");

                break;


    }
 }}

