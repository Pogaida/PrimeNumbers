import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        AnalizatorLiczbPierwszych sprawdz = new AnalizatorLiczbPierwszych();
        Scanner scanner = new Scanner(System.in);

        //Generujemy liczby przykładowo od 1 do 5_000_000
        sprawdz.generowanieLiczb(1, 5_000_000);

        //Sprawdzamy rozmiar listy
        System.out.println("Rozmiar 1 do " + sprawdz.getSize());

        //Wpisujemy index = (komurkę z listy) liczby pierwszej jaki chcemy zobaczyć
        while (true){
            sprawdz.getIndex(scanner.nextInt()-1);
        }
    }
}