import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> zapis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        long alfaTime = System.currentTimeMillis();
        for (int number = 2; number <= 100_000; number++) {
            int divider = 0;
            divider = sprawdzIleDzielnikow(number, divider);
            if(divider == 2) zapis.add(number);
        }
        long omegaTime = System.currentTimeMillis() - alfaTime;
        System.out.println("Time: " + omegaTime / 1000 + "sek");
        podajIndeks(zapis, scanner);
    }

    private static int sprawdzIleDzielnikow(int number, int divider) {
        for (int i = 1; i <= number; i++) {

            //sprawdzmy ile liczba ma dzielników
            if(number % i == 0) divider++;

            //jeśli ma więcej niż 2 dzielniki przerywa pętlę (przyspiesza program)
            if(divider > 2) break;
        }
        return divider;
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