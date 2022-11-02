import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRangeAnalyzer {
	private static final int PRIMES_LIST_RESERVED_CAPACITY = 664579;

	private final List<Integer> record = new ArrayList<>(PRIMES_LIST_RESERVED_CAPACITY);

	// konstruktor wywoujący generowanie liczb pierwszych
	public PrimeNumberRangeAnalyzer(int from, int to) {
		record.add(2);
		generatingNumbers(from, to);
	}

	// zwraca rozmiar listy liczb pierwszych
	public int getSizeOfList() {
		return record.size();
	}

	// zwraca daną komórkę z listy podaną przez użytkownika
	public boolean isNumberOfList(int numer) {
		return record.contains(numer);
	}

	public int getRecordOfList(int cell) {
		return record.get(cell);
	}

	// generuje liczby z podanego przedziału
	private void generatingNumbers(int from, int to) {
		for (int number = from; number <= to; number++) {
			if (isNumberPrime(number)) {
				record.add(number);
			}
		}
	}

	// sprawdza czy liczba jest pierwsza
	public boolean isNumberPrime(int number) {
		if (number == 1 || number == 2) {
			return false;
		}
		int divider = 1;
		for (Integer primeNumber : record) {
			if (number % primeNumber == 0)
				divider++;
			if (divider == 2 && primeNumber < number) {
				return false;
			}
			if (divider == 1 && primeNumber > Math.sqrt(number)) {
				break;
			}
		}
		return true;
	}
}