import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        PrimeNumberAnalyzer check = new PrimeNumberAnalyzer();
        Scanner scanner = new Scanner(System.in);

        //Generujemy liczby przykładowo od 1 do 5_000_000
        check.generatingNumbers(1, 5_000_000);

        //Sprawdzamy rozmiar listy i podajemy użytkownikowi
        System.out.println("List size 1 do " + check.getSize());

        //Wpisujemy komurkę z listy i wyskakuje nam liczba pierwsza jaką chcemy zobaczyć
        while (true){
            try {
                System.out.println(scanner.nextInt()-1);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bounds");
            }
        }
    }
}