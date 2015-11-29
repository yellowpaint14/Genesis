package com.teendev.genesis;

import java.util.Scanner;
public class tworcy {
    public void main()throws InterruptedException{
        czysc czysc = new czysc();
        menuGlowne menuGlowne = new menuGlowne();
        int wybor;
        Scanner skan = new Scanner(System.in);
        System.out.println("Cześć, jestem Adrian i mam 15 lat. Programowanie fascynowało mnie od dawna, dlatego to robię :)");
        System.out.println("Stworzyłem te grę w ramach nauki. Nie jest ona w żaden sposób wybitna, a jest jedynie tym, co nauczyłem się z Javy");
        System.out.println("W grze wykorzystałem swoje umiejętności oraz nieskończone zasoby internetu, z których czerpałem wiedzię potrzebną mi do tego przedsięwzięcia.");
        System.out.println("1 - Wróć do menu");
        wybor = skan.nextInt();
        switch(wybor) {
            case 1:
                czysc.main();
                menuGlowne.main();
            default:

        }
    }

}
