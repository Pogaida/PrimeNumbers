import java.util.ArrayList;
import java.util.List;

public class PrimeNumberAnalyzer {
    private final List<Integer> record = new ArrayList<>();

    public int getSize() {
        return record.size();
    }

    public void generatingNumbers(int from, int to) {
        for (int number = from; number <= to; number++) {
            whetherTheNumberIsPrime(number);
        }
    }

    public void whetherTheNumberIsPrime(int number) {
        int divider = 0;
        //Sprawdzamy ile liczba ma dzielników na początku mamy 0

        for (int i = 1; i <= number; i++) {
            //Sprawdzamy czy dana liczba jest podzielna bez reszty przez (i)
            //Jeśli tak to dodajemy ilość dzielników
            if(number % i == 0) divider++;

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
            if((divider == 2 && i < number) || (divider == 1 && i >= 1000)) {
                divider++;
                break;
            }
        }
        //Następnie po zakończeniu liczenia zapisujemy liczbę pierszą w liście zapis
        if(divider == 2){
            record.add(number);
        }
    }
}