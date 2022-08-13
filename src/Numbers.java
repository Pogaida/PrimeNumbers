public class Numbers {
    public static void main(String[] args) {
        //generujemy liczbę
        for (int number = 2; number <= 1_000; number++) {
            int[] d = new int[3];
            int divider = 0;
            for (int i = 1, j = 0; i <= number; i++) {
                //sprawdzmy ile liczba ma dzielników
                if(number % i == 0) {
                    divider++;
                    if(divider <= 3){
                        d[j] = i;
                        j++;
                    }
                }
            }
            //na podstawie ilości dzielników wypisujemy liczbę
            if(divider >= 3){
                System.out.print("[" + number + "] => ");
                System.out.println(d[1]);
            }
        }
    }
}