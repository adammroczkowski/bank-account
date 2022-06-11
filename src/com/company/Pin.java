package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pin {

    int ac_pass = 9999;
    int pw;

    public void pinInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kod PIN:");
        pw = scanner.nextInt();
    }

    public void verify() throws FileNotFoundException {

        if(pw == ac_pass)
        {
            Menu menu = new Menu();
            menu.showMenu();
        }
    }

}
