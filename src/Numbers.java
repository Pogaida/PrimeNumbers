import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> zapis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        long alfaTime = System.currentTimeMillis();

        //generujemy liczbę
        for (int number = 2; number <= 10_000; number++) {
            int divider = 0;
            for (int i = 1; i <= number; i++) {

                //sprawdzmy ile liczba ma dzielników
                if(number % i == 0) divider++;

                //jeśli ma więcej niż 2 dzielniki przerywa pętlę (przyspiesza program)
                if(divider > 2) break;
            }

            //jeśli liczba ma 2 dzielniki wpisujemy liczbę do listy
            if(divider == 2){
                zapis.add(number);
            }

        }
        long omegaTime = System.currentTimeMillis() - alfaTime;

        //czas działania programu w sekundach
        System.out.println("Time: " + omegaTime / 1000 + "sek");

        //wpisujemy indeks listy i wyświelta nam zapisaną liczbę
        podajIndeks(zapis, scanner);
    }

    private static void podajIndeks(ArrayList<Integer> zapis, Scanner scanner) {
        System.out.println("Podaj indeks z listy 1-" + zapis.size());
        for (int i = 0; i <= 10; i++) {
            System.out.print("I:");
            try {
                int indeks = scanner.nextInt();
                System.out.println(zapis.get(indeks-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("Poza granicą");
            }
        }
    }
}