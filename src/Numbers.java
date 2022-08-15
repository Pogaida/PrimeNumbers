import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> zapis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        long alfaTime = System.currentTimeMillis();

        for (int number = 1; number <= 5_000_000; number++) {
            ileDzielnikow(zapis, number);
            if(number % 50_000 == 0){
                System.out.print(".");
            }
            if(number % 1_000_000 == 0){
                System.out.println();
            }
        }
        System.out.println();

        long omegaTime = System.currentTimeMillis() - alfaTime;
        System.out.println("Time: " + omegaTime / 1000 + " sek");
        podajIndeks(zapis, scanner);
    }

    private static void ileDzielnikow(ArrayList<Integer> zapis, int number) {
        int divider = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) divider++;
            boolean warunekOne = (divider == 2 && i < number);
            boolean warunekTwo = (divider == 1 && i >= 1000);
            if(warunekOne || warunekTwo) {
                //do sprawdzania dzileników (kosmetyczne)
//                if(i >= 995){
//                    System.out.println("Nr."+number + " -> " + i);
//                }
                divider++;
                break;
            }
        }
        if(divider == 2)zapis.add(number);
    }

    private static void podajIndeks(ArrayList<Integer> zapis, Scanner scanner) {
        System.out.println("Rozmiar listy 1-" + zapis.size());
        for (int i = 0; i <= 10; i++) {
            System.out.print("Id:");
            try {
                int indeks = scanner.nextInt();
                System.out.println(zapis.get(indeks-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("Poza granicą");
            }
        }
    }
}