package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Transaction {
    public int amount = 1000;
    int amt= 0;
    static ArrayList<Integer> arl = new ArrayList();
    static Map<String, Integer> sa = new HashMap<>();

    public Transaction() throws FileNotFoundException {
    }

    // DEPOSIT
    public void userInput(int amt)
    {
        int result  = amount + amt;
        arl.add(amt);
        System.out.println(result);
    }
// WITHDRAW
    public void withdraw(int amt)
    {
        if(amount < amt)
        {
            System.out.println("Nie masz tyle kasy");
        }else{
            amount = (amount - amt);
            arl.add(-amt);
            System.out.println("Zostało ci " + amount);
        }
    }
// SAVE TO FILE
    PrintWriter saveFile = new PrintWriter("nazwa_pliku.txt");

    public static void save() throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }

    // ALL TRANSACTION
    public static void trans(){
        for(int i = 0; i < arl.size(); i++){
            System.out.println(arl.get(i));
        }
    }
    // SAVING ACCOUNT
    public  static void savingAccount(){
        System.out.println("Na co chcesz oszczędzić pieniądze");
        Scanner sc = new Scanner(System.in);
        String iteam = sc.nextLine();
        System.out.println("Ile chcesz oszczędzić");
        int iteamAmount = sc.nextInt();
        sa.put(iteam, iteamAmount);
        for (var i : sa.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }


    }
}
