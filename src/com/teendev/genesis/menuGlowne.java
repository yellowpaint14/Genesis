package com.teendev.genesis;
import java.util.Scanner;

public class menuGlowne {
    public void main() throws InterruptedException{
        pressAnyKey pressAnyKey = new pressAnyKey();
        menuGlowne menuGlowne = new menuGlowne();
        czysc czysc = new czysc();
        gra nowaGra = new gra();
        tworcy tworcyGry = new tworcy();
        wyjscie wyjscie = new wyjscie();
        int wybor;
        Scanner skan = new Scanner(System.in);
        czysc.main();
        System.out.println("Witaj w grze Genesis. Aby rozpocząć, wybierz jedną z opcji.");
        System.out.println("1 - Nowa gra");
        System.out.println("2 - Twórcy gry");
        System.out.println("3 - Wyjście z gry");
        wybor = skan.nextInt();

        switch(wybor){
            case 1:
                czysc.main();
                nowaGra.main();
                break;
            case 2:
                czysc.main();
                tworcyGry.main();
                break;
            case 3:
                czysc.main();
                wyjscie.main();
                break;
            default:
                System.out.println("Wprowadzono niepoprawną komende!");
                pressAnyKey.main();
                czysc.main();
                menuGlowne.main();
                break;
        }
    }
}
