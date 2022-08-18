import java.util.ArrayList;
import java.util.List;

public class AnalizatorLiczbPierwszych {
    List<Integer> zapis = new ArrayList<>();

    public void getIndex(int index) {
        try {
            System.out.println(zapis.get(index));

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("poza granicą");
        }
    }

    public int getSize() {
        return zapis.size();
    }

    public void generowanieLiczb(int from, int to) {
        for (int liczba = from; liczba <= to; liczba++) {
            czyLiczbaJestPierwsza(liczba);
        }
    }

    public void czyLiczbaJestPierwsza(int liczba) {
        int dzielnik = 0;
        //Sprawdzamy ile liczba ma dzielników na początku mamy 0

        for (int i = 1; i <= liczba; i++) {
            //Sprawdzamy czy dana liczba jest podzielna bez reszty przez (i)
            //Jeśli tak to dodajemy ilość dzielników
            if(liczba % i == 0) dzielnik++;

            //Następnie od razu sprawdzamy czy liczba ma już 2 dzielniki
            //oraz czy (i) jest mniejsze od liczby wtedy mamy pewność że,
            //liczba Nie jest pierwsza ponieważ
            //(6/1) dzielnik++
            //(6/2) dzielnik++
            //Nie ma sensu liczyć dalej skoro (6/6) da nam trzeci dzielnik
            //To samo się tyczy drugiego warunku który działa na takiej zasadzie że,
            //jeśli liczba jest duża i jest to liczba pierwsza to pierszy warunek nie zadziała
            //dlatego jeżeli liczba / 1000 będzie fałszywa to ozacza że,
            //liczba istotnie jest pierwsza dlatego nie ma sensu liczyć dalej
            //Ten warunek jest tak samo ważny jak pierwszy dlatego że,
            //bez nich program działa 10 minut a z nimi max 5 sekund
            //skok wydajności jest kolosalny
            if((dzielnik == 2 && i < liczba) || (dzielnik == 1 && i >= 1000)) {
                dzielnik++;
                break;
            }
        }
        //Następnie po zakończeniu liczenia zapisujemy liczbę pierszą w liście zapis
        if(dzielnik == 2){
            zapis.add(liczba);
        }
    }
}