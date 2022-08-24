import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRangeAnalyzer {
    private final List<Integer> record = new ArrayList<>();

    //ustawia pierwszą liczbę pierwszą (2)
    public PrimeNumberRangeAnalyzer(int from, int to) {
        generatingNumbers(from, to);
    }

    //zwraca daną komurkę z listy podaną przez użytkownika
    public int getRecordOfList(int cell) {
        return record.get(cell);
    }

    //zwraca rozmiar listy
    public int getSizeOfList() {
        return record.size();
    }

    //generuje liczby z podanego przedziału
    private void generatingNumbers(int from, int to) {
        //generuje liczby z podanego przedziału
        for (int number = from; number <= to; number++) {
            if (isNumberPrime(number))
                record.add(number);
        }
    }

    //Sprawdza czy liczba jest pierwsza
    public boolean isNumberPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        int divider = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) divider++;
            if (divider == 2 && i < number) {
                return false;
            }
            if (divider == 1 && i > Math.sqrt(number)) {
                break;
            }
        }
        return true;
    }
}