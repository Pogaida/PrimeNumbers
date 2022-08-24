import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        PrimeNumberRangeAnalyzer check = new PrimeNumberRangeAnalyzer(1, 10_000_000);
        Scanner scanner = new Scanner(System.in);

        //Wpisujemy liczbę i sprawdzamy czy jest na liście
        System.out.println("1.Liczba");
        System.out.println("2.Komurka od 1 do " + check.getSizeOfList());
        while (true){
            System.out.print("\nWybór:");
            switch (scanner.nextInt()){
                case 1:
                    System.out.print("Podaj:");
                    int number = scanner.nextInt();
                    boolean isOnList = check.isNumberOfList(number);
                    if(isOnList){
                        System.out.println("TRUE");
                    }
                    else {
                        System.out.println("FALSE");
                    }
                    break;
                case 2:
                    System.out.print("Podaj:");
                    int cell = scanner.nextInt();
                    try {
                        System.out.println(check.getRecordOfList(cell-1));
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Out of bounds");
                    }

            }
        }
    }
}