import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRangeAnalyzer {
	private static final int PRIMES_LIST_RESERVED_CAPACITY = 664579;

	private final List<Integer> record = new ArrayList<>(PRIMES_LIST_RESERVED_CAPACITY);

	private int rangeStart;
	private int rangeEnd;
	private int firstIndexInRange;

	// konstruktor wywoujący generowanie liczb pierwszych
	public PrimeNumberRangeAnalyzer(int from, int to) {
		record.add(2);
		generatingNumbers(3, to);
		rangeStart = from;
		rangeEnd = to;
		int i;
		for (i = 0; i < record.size(); i++) {
			if (record.get(i) >= from)
				break;
		}
		firstIndexInRange = i;
	}

	// zwraca rozmiar listy liczb pierwszych
	public int getSizeOfList() {
		return record.size() - firstIndexInRange;
	}

	// zwraca daną komórkę z listy podaną przez użytkownika
	public boolean isNumberOfList(int numer) {
		if (numer < rangeStart)
			return false;
		return record.contains(numer);
	}

	public int getRecordOfList(int cell) {
		return record.get(cell + firstIndexInRange);
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