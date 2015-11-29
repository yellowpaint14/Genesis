package com.teendev.genesis;

import com.sun.xml.internal.ws.api.server.ThreadLocalContainerResolver;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;
public class gra {
    Scanner skan = new Scanner(System.in);
    public int wybor = 0;
    boolean sk1;
    boolean sk2;
    boolean sk4;
    boolean sk5;
    boolean sk6;
    boolean sk7;
    public int notatki;
    int byltu;

    public void main() throws InterruptedException {
        start();
    }

    public void start() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Powoli przebudzasz się ze snu, dochodzą Cię promienie światła pochodni wiszącej na ścianie...");
        Thread.sleep(3000);
        System.out.println("Czujesz na swojej skórze zimno i wilgoć, ciągle mocno śpisz, jednak powoli Twoje oczy przyzwyczajają się do panującego wszędzie półmroku...");
        Thread.sleep(3000);
        System.out.println("Czujesz zimny powiew wiatru, który przerywa twój sen, powoli otwierasz oczy, ciągle zaspane, rozglądasz się dookoła powoli z głową na zimnej, betonowej posadzce.");
        Thread.sleep(3000);
        System.out.println("Jesteś już całkiem przytomny, powoli wstajesz, tak żeby nie upaść. Rozglądasz się i na prawo i lewo widzisz tylko korzytarz w półmroku. Przed Tobą znajduje się obraz bliżej nieokreślonego artysty.");
        Thread.sleep(3000);
        System.out.println("Stoisz już o własnych siłach, co robisz?");
        Thread.sleep(1000);
        startwybor();
    }

    public void obraz1() throws InterruptedException {
        System.out.println("Obok obrazu płonie pochodnia, dzięki której udaje Ci się dostrzec co się na nim znajduje.");
        System.out.println("Na obrazie widnieje mężczyzna w czerwonej szacie, o białym kolorze skóry, siwych włosach w asystencie dwóch innych mężczyzn za nim, ubranych w inne ubrania, lecz obaj również mają siwe włosy");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź korytarzem na zachód");
        System.out.println("2 - Idź korytarzem na wschód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                lewkor1();
                break;
            case 2:
                prawkor1();
                break;
            default:
        }
    }

    public void startwybor() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Znajduje się tu obraz, możesz iść na wschód, zachód, lub obejrzeć obraz. Co robisz?");
        System.out.println("1 - Przyglądnij się obrazowi");
        System.out.println("2 - Idź korytarzem na zachód");
        System.out.println("3 - Idź korytarzem na wschód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                obraz1();
                break;
            case 2:
                czysc.main();
                lewkor1();
                break;
            case 3:
                czysc.main();
                prawkor1();
                break;
            default:
        }

    }

    public void lewkor1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu skrzyżowanie, na ścienie widnieją dziwne wzory, masz wrażenie że posiadają jakąś tajemną wiedzę. Możesz pójść na północ, południe lub wschód, co robisz?");
        System.out.println("1 - Idź na wschód");
        System.out.println("2 - Idź na północ");
        System.out.println("3 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                startwybor();
                break;
            case 2:
                czysc.main();
                prawkor2();
                break;
            case 3:
                czysc.main();
                lewkor2();
                break;
            default:
        }
    }

    public void prawkor1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu zimno i wilgotno, na ścienie wiszą 3 pochodnie, z czego jedna już się dopala, na podłodze leży stos brudnych szmat.Możesz iść na południe lub zachód co robisz?");
        System.out.println("1 - Idź na zachód");
        System.out.println("2 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                startwybor();
                break;
            case 2:
                czysc.main();
                prawkor3();
                break;
            default:
        }
    }

    public void prawkor3() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Podłogę porasta mech, a na ścianie wiszą obrazy jakichś ważnych postaci, jest ich w sumie 10.Jest tu zakręt na wschód. Możesz iść na północ, na południe lub na wschód.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na północ");
        System.out.println("2 - Idź na wschód");
        System.out.println("3 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                prawkor1();
                break;
            case 2:
                czysc.main();
                lewkor3();
                break;
            case 3:
                czysc.main();
                prawkor3a();
                break;
            default:

        }

    }

    public void prawkor2() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu ciemno, udaje Ci się wymacać kamienną ścianę. Wygląda na to że to ślepa uliczka.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                lewkor1();
                break;
            default:
        }
    }

    public void lewkor2() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Stoi tutaj rząd urn pogrzebowych, z których każda została opatrzona przynajmniej jednym obrazkiem. Na wschód znajduje się korytarz, z którego widać prztłumioną łunę światła, możesz też iść na północ lub południe");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na północ");
        System.out.println("2 - Idź na wschód");
        System.out.println("3 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                lewkor1();
                break;
            case 2:
                czysc.main();
                lewkor4();
                break;
            case 3:
                czysc.main();
                lewkor2a();
                break;
            default:
        }
    }

    public void lewkor3() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Korytarz wydaje się znacznie ciemniejszy i mroczniejszy od pozostałych, po krótkiej wędrówce na wschód dochodzisz do żelaznych drzwi.Widzisz że są lekko uchylone, wydobywa się zza nich promień światła.");
        System.out.println("Możesz tam wejść lub wrócić, co robisz?");
        System.out.println("1 - Wejdź do srodka");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave1();
                break;
            case 2:
                czysc.main();
                prawkor3();
                break;
            default:
        }
    }

    public void prawkor3a() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu bardzo ciemno, a wszystko wokół skąpane jest w głębokiej czerni.Możesz iść na zachód lub północ");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na zachód");
        System.out.println("2 - Idź na północ");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                prawkor4();
                break;
            case 2:
                czysc.main();
                prawkor3();
                break;
            default:
        }
    }

    public void cave1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni.");
        System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
        System.out.println("1 - Zobacz co jest w skrzynce");
        System.out.println("2 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                sk1();
                break;
            case 2:
                czysc.main();
                lewkor3();
                break;
            default:
        }
    }

    public void sk1() throws InterruptedException {
        czysc czysc = new czysc();
        if (sk1 == false) {
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz? ");
            sk1 = true;
            notatki++;
        } else {
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("1 - Wyjdź z pomieszczenia.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                lewkor3();
                break;
            default:
        }

    }

    public void lewkor4() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Korytarz wydaje się znacznie ciemniejszy i mroczniejszy od pozostałych, po krótkiej wędrówce dochodzisz do żelaznych drzwi.Widzisz że są lekko uchylone, wydobywa się zza nich promień światła.");
        System.out.println("Co robisz?");
        System.out.println("1 - Wejdź do srodka");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave2();
                break;
            case 2:
                czysc.main();
                lewkor2();
                break;
            default:
        }
    }

    public void lewkor2a() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu bardzo ciemno, nie widzisz nawet swoich rąk, mimo że masz je przed sobą. Udaje Ci się wymacać zakręt ściany, możesz iść na wschód lub północ.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na wschód");
        System.out.println("2 - Idź na północ");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                lewkor5();
                break;
            case 2:
                czysc.main();
                lewkor2();
                break;
            default:
        }
    }

    public void cave2() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni.");
        System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
        System.out.println("1 - Zobacz co jest w skrzynce");
        System.out.println("2 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                sk2();
                break;
            case 2:
                czysc.main();
                lewkor4();
                break;
        }
    }

    public void sk2() throws InterruptedException {
        czysc czysc = new czysc();
        if (sk2 == false) {
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz? ");
            sk2 = true;
            notatki++;
        } else {
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("1 - Wyjdź z pomieszczenia.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                lewkor4();
                break;
            default:
        }
    }

    public void lewkor5() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Na wschód są żelazne drzwi, które mają w sobie klucz i możesz je otworzyć, możesz też iść na zachód.");
        System.out.println("1 - Idź drzwiami na wschód");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                skr1();
                break;
            case 2:
                czysc.main();
                lewkor2a();
                break;
            default:
        }
    }

    public void prawkor4() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Na zachód są żelazne drzwi, które mają w sobie klucz i możesz je otworzyć, możesz też iść na wschód");
        System.out.println("1 - Idź drzwiami na zachód");
        System.out.println("2 - Idź na wschód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                skr1();
                break;
            case 2:
                czysc.main();
                prawkor3a();
                break;
            default:
        }
    }

    public void skr1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Znajduje się tu skrzyżowanie, możesz iść w kierunku północnym i południowym, drzwi na wschodzie i zachodzie są jednak zatrzaśnięte.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź w stronę połnocną");
        System.out.println("2 - Idź w stronę południową");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                korn1();
                break;
            case 2:
                czysc.main();
                kors1();
                break;
            default:
        }
    }

    public void korn1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Stąpasz korytarzem na północ, dochodzisz w końcu do ściany. Wygląda na to, że to ślepa uliczka, jednak wydaje Ci się że możesz sie jej bliżej przyjrzeć. Co robisz?");
        System.out.println("1 - Przyjrzyj się ścianie");
        System.out.println("2 - Wróć");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                System.out.println("Tak jak się wydawało! Na ścianie jest przycisk, po jego nacisnięciu ściana się przesuwa i jesteś w punkcie wyjścia.");
                startwybor();
                break;
            case 2:
                czysc.main();
                skr1();
                break;
            default:
        }
    }

    public void kors1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Idąc korytarzem na południe dochodzisz w końcu do żelaznych drzwi. Drzwi są uchylone, i widać zza nich promień światłą. Co robisz?");
        System.out.println("1 - Wejdź do środka");
        System.out.println("2 - Wróć");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave3();
                break;
            case 2:
                czysc.main();
                skr1();
                break;
            default:
        }
    }

    public void cave3() throws InterruptedException {
        czysc czysc = new czysc();
        switch (byltu) {
            case 0:
                System.out.println("Z pomieszczenia dochodzą dziwne, jakby szaleńcze jęki, powoli przekraczasz próg drzwi...");
                Thread.sleep(2500);
                System.out.println("W środku jest dość ciemno, pali się (A właściwie dopala) tylko jedna pochodnia, która ledwo oświetla wnętrze pokoju.");
                Thread.sleep(4000);
                System.out.println("Zauważasz starca chodzące na prawo i lewo, cały czas mówiącego coś do siebie, jakby bardzo się martwił.");
                Thread.sleep(4000);
                System.out.println("Starzec Cię zauważa i niemal podskakuje z przerażenia.");
                System.out.println("\n");
                System.out.println("- Aaaa! Ty jesteś jednym z nich! Nie, proszę, zostaw mni... Poczekaj, ty mi nie wyglądasz na jednego z nich... Hej ty, cóżeś za jeden! Tu się prowadzi bardzo poważne badania naukowe! Wynocha mi stąd");
                Thread.sleep(7400);
                System.out.println("1 - *Uciekaj w popłochu*");
                System.out.println("2 - Hej, staruszku, spokojnie, nawet nie wiem kim jesteś!");
                System.out.println("3 - Mogłbym zadać ci to samo pytanie");
                System.out.println("4 - Nie do końca wiem, gdzie się znajduje");
                wybor = skan.nextInt();
                switch (wybor) {
                    case 1:
                        czysc.main();
                        kors1();
                        break;
                    case 2:
                        cave3a();
                        break;
                    case 3:
                        wyjasnienie();
                        break;
                    case 4:
                        wyjasnienie();
                        break;
                    default:
                }
                break;
            case 1:
                System.out.println("Jesteś, i co, masz coś dla mnie??");
                switch (notatki) {
                    case 2:
                        System.out.println("1 - Pokaż co masz");
                        wybor = skan.nextInt();
                        switch(wybor){
                            case 1:
                                czysc.main();
                                notatki2();
                                break;
                            default:
                        }
                        break;
                    case 1:
                        System.out.println("1 - Pokaż co masz");
                        wybor = skan.nextInt();
                        switch(wybor){
                            case 1:
                                czysc.main();
                                notatki1();
                                break;
                            default:
                        }
                        break;
                    default:
                        System.out.println("1 - Pokaż co masz");
                        wybor = skan.nextInt();
                        switch(wybor){
                            case 1:
                                czysc.main();
                                notatkibrak();
                                break;
                            default:
                        }
                        break;
                }
                break;
        }

    }

    public void cave3a() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - A ja za to wiem kim ty jesteś! Intruzem! I chcesz przeszkodzić moim badaniom! Gdybym tylko mógł samodzielnie je prowadzić...");
        Thread.sleep(4000);
        System.out.println("1 - Cóż, chyba musisz poradzić sobie sam. *Wyjdź z pomieszczenia*");
        System.out.println("2 - Najpierw chciałbym się dowiedzieć co to jest za miejsce, i co tutaj robię.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kors1();
                break;
            case 2:
                wyjasnienie();
                break;
            default:
        }
    }

    public void wyjasnienie() throws InterruptedException {
        pressAnyKey pressAnyKey = new pressAnyKey();
        czysc czysc = new czysc();
        byltu++;
        System.out.println("Och, to ty nie wiesz? Ja jestem magiem Arduinem, a to miejsce, to cóż - Moje laboratorium! Jednak ostatnio wszystko wymknęło się spod kontroli...");
        Thread.sleep(3500);
        pressAnyKey.main();
        czysc.main();
        System.out.println("Prowadziłem tu w spokoju swoje badania, byłem bardzo blisko dojścia do prawdy o nich, ale w ostatnim momencie... Obudzili się! Dowiedzieli się o mojej obecności! Szybko zacząłem uciekać z terenu eksperymentów, w popłochu chowając swoje zapiski w różne miejsca. Problem leży w tym, że teraz ich nie mam, a to miejsce jest bezpieczne tylko dlatego że utrzymuje je moja magia... Hej, ty tam przecież byłeś, nie dopadli cię, prawda? Nie wiem jak to możliwe... Ale może znalazłeś chociaż część moich zapisków? Tak bardzo mi na nich zależy... Bez nich nie mam szans na przywrócenie porządku i kontynuowanie badań!");
        System.out.println("1 - Pokaż co masz");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                switch (notatki) {
                    case 2:
                        czysc.main();
                        notatki2();
                        break;
                    case 1:
                        czysc.main();
                        notatki1();
                        break;
                    default:
                        czysc.main();
                        notatkibrak();
                        break;
                }
                break;
            default:
        }

    }

    public void notatkibrak() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - No skoro nic nie masz, nie mamy chyba o czym rozmawiać. Ciebie chyba nie widzą, nie wiem, w każdym razie ciebie nie zabiją. Wróć, gdy coś będziesz miał dla mnie.");
        System.out.println("1 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kors1();
                break;
            default:
        }
    }

    public void notatki1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Widzę że masz jedną kartkę... Ale to nadal za mało! Zostawiłem tam jeszcze jedną! Proszę, idź i poszukaj, ciebie nie zabiją a mnie od razu.");
        System.out.println("1 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kors1();
                break;
            default:
        }
    }

    public void notatki2() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - świetnie! Masz obie kartki! A więc tak... aha.. mhm... tak tak, dokładnie... Już wiem!");
        System.out.println(" - Mogę ich pokonać, ale to nie wszystko. Potrzebuję jeszcze czterech moich notatek, które są tam, za tymi drzwiami. *Wskazuje żelazne drzwi na południu*");
        System.out.println(" - Słuchaj, naprawdę nie chcę spędzić tu wieczności, musimy działać razem i odkręcić to co zrobiłem, to jak, wchodzisz w to?");
        System.out.println("1 - Pewnie że tak");
        System.out.println("2 - No chyba nie sądzisz, że ratuję czarodziei za darmo?");
        System.out.println("3 - Nawet nie wiem kim jesteś, nie ufam ci");
        System.out.println("4 - Radź sobie sam, ja się stąd zmywam.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                zgoda();
                break;
            case 2:
                czysc.main();
                chcekasy();
                break;
            case 3:
                czysc.main();
                nieufamu();
                break;
            case 4:
                czysc.main();
                niepomoze();
                break;
            default:
        }
    }

    public void zgoda() throws InterruptedException {
        pressAnyKey pressAnyKey = new pressAnyKey();
        czysc czysc = new czysc();
        System.out.println(" - Doskonale, naprawdę doskonale! Słuchaj mnie teraz uważnie, otworzę ci te drzwi, a ty tam pójdziesz i poszukasz notatek, dzięki którym uda mi się ich powstrzymać, co? Wtedy wyjdziemy stąd razem! Pamiętaj, przynieś mi je wszystkie!");
        System.out.println("1 - Idź za czarodziejem do drzwi");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                System.out.println(" - Proszę, otwieram. Będę tu na ciebie czekał, pamiętaj, żeby przynieść mi ich jak najwięcej, najlepiej wszystkie!");
                pressAnyKey.main();
                czysc.main();
                kor1();
                break;
            default:
        }
    }

    public void chcekasy() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - Niestety, ale nie mam ci czym zapłacić. Nawet jeśli bym chciał, te badania to wszytsko co miałem! Proszę, zrób to dla mnie...");
        System.out.println("1 - Zgódź się");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                zgoda();
                break;
            default:
        }
    }

    public void nieufamu() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - Ale znalazłeś się w obszarze moich badań! Nie wiem, jak tam wszedłeś, ale teraz gdy jestem tu uwięziony, powinieneś pomóc mi się stąd wydostać.Proszę...");
        System.out.println("1 - Zgódź się");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                zgoda();
                break;
            default:
        }
    }

    public void niepomoze() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - Nie wydostaniesz się stąd, bo ja mam klucz do tych drzwi. *Wskazuje palcem na drzwi na południu* Jeśli chcesz się stąd wydostać, musimy współpracować. To jak?");
        System.out.println("1 - Zgódź się");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                zgoda();
                break;
            default:
        }
    }

    public void kor1() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Na ścianach są pochodnie, a wszędzie wokół wala się rozbite szkło. Możesz iść na północ, wschód lub zachód.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na północ");
        System.out.println("2 - Idź na wschód");
        System.out.println("3 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                drzwi();
                break;
            case 2:
                czysc.main();
                kor2();
                break;
            case 3:
                czysc.main();
                kor3();
                break;
            default:
        }
    }

    public void drzwi() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("*Pukasz do drzwi*");
        Thread.sleep(1000);
        System.out.println("*W drzwiach staje czarodziej");
        Thread.sleep(300);
        System.out.println(" - O, to ty! I co jesteś cały?? Masz coś dla mnie??");
        System.out.println("1 - Pokaż co masz");
        System.out.println("2 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                switch(notatki){
                    case 6:
                        czysc.main();
                        zakonczenie();
                        break;
                    default:
                        System.out.println("Ehh, nie wracaj do mnie jeśli nie masz wszystkich! Po co mi tylko " + notatki + "! Potrzebuję wszystkich, a było ich więcej. Wracaj szukać dalej.");
                        System.out.println("1 - Idź na południe");
                        wybor = skan.nextInt();
                        switch (wybor) {
                            case 1:
                                czysc.main();
                                kor1();
                                break;
                            default:
                    }
                }
                break;
            case 2:
                czysc.main();
                kor1();
                break;
            default:
        }
    }

    public void kor2() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Bardzo tu śmierdzi stęchlizną, pod ścianą stoi zbroja na stojaku, wyglądająca jak żołnierz na warcie. Możesz iść na północ, zachód lub wschód");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na północ");
        System.out.println("2 - Idź na zachód");
        System.out.println("3 - Idź na wschód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kor5();
                break;
            case 2:
                czysc.main();
                kor1();
                break;
            case 3:
                czysc.main();
                kor4();
                break;
            default:
        }
    }

    public void kor3()throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Wszędzie walają się obrazy, wiele z nich jest nadpalonych, jeszcze więcej potarganych. Wszystko porasta gruba warstawa mchu, co utrudnia poruszanie. Możesz iść na północ, wschód lub południe.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na wschód");
        System.out.println("2 - Idź na północ");
        System.out.println("3 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kor1();
                break;
            case 2:
                czysc.main();
                kor6();
                break;
            case 3:
                czysc.main();
                kor7();
                break;
            default:
        }
    }

    public void kor6() throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Na północ znajdują się drzwi, są one lekko uchylone, zza nich dobiegają jakieś dziwne dźwięki. Możesz tam wejść, lub iść na południe.");
        System.out.println("Co robisz?");
        System.out.println("1 - Wejdź do środka");
        System.out.println("2 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave4();
                break;
            case 2:
                czysc.main();
                kor3();
                break;
            default:
        }
    }

    public void kor5() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Na północ znajdują się drzwi, są one lekko uchylone, zza nich dobiega promień światła. Możesz tam wejść lub iść na południe");
        System.out.println("Co robisz?");
        System.out.println("1 - Wejdź do środka");
        System.out.println("2 - Idź na południe");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave5();
                break;
            case 2:
                czysc.main();
                kor2();
                break;
            default:
        }
    }

    public void cave5() throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni.");
        System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
        System.out.println("1 - Zobacz co jest w skrzynce");
        System.out.println("2 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                sk4();
                break;
            case 2:
                czysc.main();
                kor5();
                break;
            default:
        }
    }

    public void sk4() throws InterruptedException {
        czysc czysc = new czysc();
        if (sk4 == false) {
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz?");
            sk4 = true;
            notatki++;
        } else {
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("1 - Wyjdź z pomieszczenia.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kor5();
                break;
            default:
        }
    }

    public void cave4()throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni.");
        System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
        System.out.println("1 - Zobacz co jest w skrzynce");
        System.out.println("2 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                sk5();
                break;
            case 2:
                czysc.main();
                kor6();
                break;
            default:

        }
    }

    public void sk5()throws InterruptedException {
        czysc czysc = new czysc();
        if (sk5 == false) {
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz? ");
            sk5 = true;
            notatki++;
        } else {
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("1 - Wyjdź z pomieszczenia.");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kor6();
                break;
            default:
        }
    }
    public void kor4()throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Jest tu stos przemoczonych książek, większości z nich nie da się przeczytać ponieważ kartki są przemoczone tak, że rozpadają się w ręce.");
        System.out.println("Możesz iść na południe lub zachód");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na południe");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                kor8();
                break;
            case 2:
                czysc.main();
                kor2();
                break;
            default:
        }
    }
        public void kor7()throws InterruptedException{
            czysc czysc = new czysc();
            System.out.println("Pod ścianą stoją w rzędzie zbroje na stojakach, czujesz jakby Cię obserwowały. Możesz iść na północ, południe, wschód lub zachód");
            System.out.println("Co robisz?");
            System.out.println("1 - Idź na północ");
            System.out.println("2 - Idź na południe");
            System.out.println("3 - Idź na wschód");
            System.out.println("4 - Idź na zachód");
            wybor = skan.nextInt();
            switch(wybor){
                case 1:
                    czysc.main();
                    kor3();
                    break;
                case 2:
                    czysc.main();
                    kor9();
                    break;
                case 3:
                    czysc.main();
                    kor11();
                    break;
                case 4:
                    czysc.main();
                    kor10();
                    break;
                default:
            }
    }
    public void kor8()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Idąc korytarzem, coś nagle zatrzeszczało, a Ty poczułeś na swojej skórze zimny powiew niewiadomego pochodzenia. Wszędzie walają się lniane szmaty, a do Twoich nozdrzy dociera mocny zapach stęchlizny. Możesz iść na północ lub zachód, co robisz?");
        System.out.println("Co robisz?");
        System.out.println("1 - Idż na zachód");
        System.out.println("2 - Idź na północ");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor12();
                break;
            case 2:
                czysc.main();
                kor4();
                break;
            default:
        }
    }
    public void kor10()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Jest tu wysoka, kamienna ściana, pochodnie po prawej i lewej ją oświetlają, jednak jest to ślepa uliczka, nie możeszz iść dalej. Możesz iść na wschód");
        System.out.println("1 - Idź na wschód");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor7();
                break;
            default:
        }
    }
    public void kor9()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Jest tu dosyć czysto, jednak bardzo ciemno i nie bardzo wiesz gdzie idziesz. Możesz iść na zachód lub północ.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na zachód");
        System.out.println("2 - Idź na północ");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor13();
                break;
            case 2:
                czysc.main();
                kor7();
                break;
            default:
        }
    }
    public void kor11()throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println("Na wschód znajdują się drzwi, są one lekko uchylone, zza nich dobiega promień światła. Możesz tam wejść lub iść na zachód");
        System.out.println("Co robisz?");
        System.out.println("1 - Wejdź do środka");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                cave6();
                break;
            case 2:
                czysc.main();
                kor7();
                break;
            default:
        }
    }
        public void cave6() throws InterruptedException{
            czysc czysc = new czysc();
            System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni.");
            System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
            System.out.println("1 - Zobacz co jest w skrzynce");
            System.out.println("2 - Wyjdź z pomieszczenia");
            wybor = skan.nextInt();
            switch (wybor) {
                case 1:
                    sk7();
                    break;
                case 2:
                    czysc.main();
                    kor11();
                    break;
                default:
            }
        }
    public void sk7()throws InterruptedException{
        czysc czysc = new czysc();
        if(sk6 == false){
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz?");
            notatki++;
            sk6 = true;
        }
        else{
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("Co robisz?");
        System.out.println("1 - Wyjdź z pomieszczenia");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor11();
                break;
            default:
        }
    }
    public void kor12()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("światło jest tu bardzo przytłumione, podłogę porasta śliski mech, musisz bardzo uważać żeby się nie przewrócić.Na zachodzie są stalowe drzwi, z których biegnie promień światła.");
        System.out.println("Możesz iść na zachód lub wschód.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na zachód");
        System.out.println("2 - Idź na wschód");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                cave7();
                break;
            case 2:
                czysc.main();
                kor8();
                break;
            default:
        }
    }
    public void cave7()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Wchodzisz po cichu do pomieszczenia, jest dosć ciasne, pali się w nim kilka pochodni. Są tu drzwi na wschód i południe, co robisz?");
        System.out.println("Pod ścianą zauważasz skrzynkę, co robisz?");
        System.out.println("1 - Zobacz co jest w skrzynce");
        System.out.println("2 - Idź na wschód");
        System.out.println("3 - Idź na południe");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                sk8();
                break;
            case 2:
                czysc.main();
                kor11();
                break;
            default:
        }
    }
    public void sk8()throws InterruptedException{
        czysc czysc = new czysc();
        if(sk7 == false){
            System.out.println("Znajdujesz kartkę z jakimiś dziwnymi wzorami. Chowasz ją do kieszeni. Co robisz?");
            notatki++;
            sk7 = true;
        }
        else{
            System.out.println("Zabrałeś już rzecz stąd.");
        }
        System.out.println("1 - Idź na wschód");
        System.out.println("2 - Idź na południe");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor12();
                break;
            case 2:
                czysc.main();
                kor14();
                break;
            default:
        }
    }
    public void kor14()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Stoi tu duży posąg, którego czas wyraźnie nie oszczędził. Możesz iść na północ lub na zachód.");
        System.out.println("Co robisz?");
        System.out.println("1 - Idź na północ");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                cave7();
                break;
            case 2:
                czysc.main();
                kor13();
                break;
            default:
        }
    }
    public void kor13()throws InterruptedException{
        czysc czysc = new czysc();
        System.out.println("Jest tu nadzwyczaj cicho i pusto, wszędzie wokół jest jasno, mimo że na ścianach nie widzisz pochodni.Możesz iść na wschód lub zachód, co robisz?");
        System.out.println("1 - Idź na wschód");
        System.out.println("2 - Idź na zachód");
        wybor = skan.nextInt();
        switch(wybor){
            case 1:
                czysc.main();
                kor14();
                break;
            case 2:
                czysc.main();
                kor9();
                break;
            default:
        }
    }
    public void zakonczenie()throws InterruptedException {
        czysc czysc = new czysc();
        System.out.println(" - Ooo! Dobrze, dobrze, wchodź synku, świetnie! Tak, to jest to o co mi chodziło, jeszcze tylko tutaj... O rzeczywiśie...Tak tak, to jest to... I jestem gotowy!");
        System.out.println("No i co synku, jesteś gotowy na to żeby stąd wyjść? Dzięki tobie uda nam się obu stąd wyjść! Jestem twoim dłużnikiem!");
        System.out.println("1 - Jestem gotowy");
        wybor = skan.nextInt();
        switch (wybor) {
            case 1:
                czysc.main();
                koniecgry();
                break;
            default:
        }
    }
        public void koniecgry()throws InterruptedException{
            czysc czysc = new czysc();
            menuGlowne menuGlowne = new menuGlowne();
            pressAnyKey pressAnyKey = new pressAnyKey();
            Thread.sleep(2000);
            System.out.println("W mgnieniu oka, Twoje oczy są bombardowane światłem słonecznym. Stoisz na jakiejś polanie, starając się ochronić oczy przed promieniami słonecznymi. Wszędzie jest cisza, rozglądasz się dookoła, udaje Ci się dostrzec maga Arduina.");
            Thread.sleep(6000);
            System.out.println(" - Hej, tu jestem! - Woła mag. - Wszystko w porządku? - Pyta.");
            Thread.sleep(2000);
            System.out.println(" - Tak, wszystko dobrze, a z tobą?");
            Thread.sleep(1500);
            System.out.println(" - Też - Odpowiada podbiegając do Ciebie. - To już chyba pora zakończyć naszą wspólną drogę, co?");
            Thread.sleep(4000);
            System.out.println(" - Tak, chyba tak... Ale mam nadzieję że jeszcze się spotkamy? - Pytasz pełen obaw.");
            Thread.sleep(3500);
            System.out.println(" - Tak, jestem tego pewny. Szybciej niż się spodziewasz. - Odpowowiedział, i poszedł w swoją stronę. W stronę swojego miasta.");
            Thread.sleep(4000);
            pressAnyKey.main();
            czysc.main();
            System.out.println("KONIEC.");
            Thread.sleep(3000);
    }

}
