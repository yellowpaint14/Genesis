package com.teendev.genesis;

import java.util.Scanner;
public class wyjscie {
    public void main()throws InterruptedException{
        czysc czysc = new czysc();
        menuGlowne menu = new menuGlowne();
        int wybor = 0;
        System.out.println("Czy na pewno chcesz wyjść?");
        System.out.println("1 - Nie");
        System.out.println("2 - Tak");
        Scanner skan = new Scanner(System.in);
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                menu.main();
                break;
            case 2:
                break;
        }
    }
}
