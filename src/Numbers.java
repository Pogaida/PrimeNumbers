import java.util.Scanner;

public class Numbers {

	private static final int PRIME_ANALYZER_RANGE_START = 6;
	private static final int PRIME_ANALYZER_RANGE_END = 10_000_000;

	public static void main(String[] args) {
		PrimeNumberRangeAnalyzer check = new PrimeNumberRangeAnalyzer(PRIME_ANALYZER_RANGE_START,
				PRIME_ANALYZER_RANGE_END);
		System.out.println(
				"Liczby pierwsze z zakresu od " + PRIME_ANALYZER_RANGE_START + " do " + PRIME_ANALYZER_RANGE_END);

		Scanner scanner = new Scanner(System.in);

		// Wpisujemy liczbę i sprawdzamy czy jest na liście
		System.out.println("1. Test liczby");
		System.out.println("2. Kolejna liczba pierwsza z zakresu (od 1 do " + check.getSizeOfList() + ")");
		while (true) {
			System.out.print("\nTwój wybór: ");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("Podaj liczbę: ");
				int number = scanner.nextInt();
				boolean isOnList = check.isNumberOfList(number);
				if (isOnList) {
					System.out.println("To jest liczba pierwsza.");
				} else {
					System.out.println("Ta liczba nie jest pierwsza lub jest poza badanym zakresem.");
				}
				break;
			case 2:
				System.out.print("Podaj numer liczby pierwszej: ");
				int cell = scanner.nextInt();
				try {
					System.out.println(check.getRecordOfList(cell - 1));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Przekroczony zakres!");
				}
				break;
			default:
				System.out.print("Nieobsługiwana opcja!");
			}
		}
	}
}