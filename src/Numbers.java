import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        PrimeNumberRangeAnalyzer check = new PrimeNumberRangeAnalyzer(1, 1_000_000);
        Scanner scanner = new Scanner(System.in);

        //Sprawdzamy rozmiar listy i podajemy użytkownikowi
        System.out.println("List size = " + check.getSizeOfList());

        //Wpisujemy komurkę z listy i wyskakuje nam liczba pierwsza jaką chcemy zobaczyć
        while (true){
            try {
                System.out.print("Podaj liczbę ");
                int number = scanner.nextInt();
                System.out.println(check.isNumberPrime(number));
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bounds");
            }
        }
    }
}