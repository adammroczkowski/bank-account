package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
class Menu{
    int selectedOption;


    public void showMenu() throws FileNotFoundException {
        boolean shouldContinue = true;
        while(shouldContinue){
        System.out.println("Wybiesz operacje:");
        System.out.println("Wciśnij 1 jeżeli chcesz wpłacić pieniądze.");
        System.out.println("Wciśnij 2 jeżeli chesz wypłącić pieniądze.");
        System.out.println("Wciśnij 3 jeżeli chcesz zobaczyć stan konta");
        System.out.println("Wciśnij 4 jeżeli chcesz sprawdzić wszystkie transakcje");
        System.out.println("Wciśnij 5 jeżeli chcesz wpłacić na konto oszczędniościowe");
        System.out.println("Wciśnij 6 jeżeli chcesz wyjść");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println (" ");
        selectedOption = scanner.nextInt();


        switch (selectedOption) {
            case 1:
                Transaction d = new Transaction();
                System.out.println("Ile chcesz wpłacić:");
                int deposit =scanner.nextInt();
                d.userInput(deposit);
                System.out.println();
                break;
            case 2:
                Transaction w = new Transaction();
                System.out.println("Ile chcesz wypłacić:");
                int withdraw =scanner.nextInt();
                w.withdraw(withdraw);
                break;
            case 3:
                Transaction a = new Transaction();
                a.save();
                break;
            case 4:
                Transaction t = new Transaction();
                t.trans();
                break;
            case 5:
                Transaction savingAm = new Transaction();
                savingAm.savingAccount();
                break;
            case 6:
                shouldContinue = false;
                break;
            default:
                System.out.println("Operacja niemożliwa");

        }

    }
    }

}