import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRangeAnalyzer {
    private final List<Integer> record = new ArrayList<>(664579);

    //konstruktor wywoujący generowanie liczb
    public PrimeNumberRangeAnalyzer(int from, int to) {
        record.add(2);
        generatingNumbers(from, to);
    }

    //zwraca Rozmiar listy
    public int getSizeOfList() {
        return record.size();
    }

    //zwraca daną komurkę z listy podaną przez użytkownika
    public boolean isNumberOfList(int numer) {
        return record.contains(numer);
    }

    public int getRecordOfList(int cell) {
        return record.get(cell);
    }

    //generuje liczby z podanego przedziału
    private void generatingNumbers(int from, int to) {
        for (int number = from; number <= to; number++) {
            if (isNumberPrime(number)){
                record.add(number);
            }
        }
    }

    //Sprawdza czy liczba jest pierwsza
    public boolean isNumberPrime(int number) {
        if (number == 1 || number == 2) {
            return false;
        }
        int divider = 1;
        for (Integer integer : record) {
            if (number % integer == 0) divider++;
            if (divider == 2 && integer < number) {
                return false;
            }
            if (divider == 1 && integer > Math.sqrt(number)) {
                break;
            }
        }
        return true;
    }
}