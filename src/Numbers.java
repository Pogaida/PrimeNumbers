public class Numbers {
    public static void main(String[] args) {
        //generujemy liczbę
        for (int number = 2; number <= 5_000; number++) {
            int divider = 0;
            for (int i = 1; i <= number; i++) {
                //sprawdzmy ile liczba ma dzielników
                if(number % i == 0) divider++;

                //jeśli ma więcej niż 2 dzielniki przerywa pętlę (przyspiesza program)
                if(divider > 2) break;
            }
            //jeśli liczba ma 2 dzielniki wypisujemy liczbę
            if(divider == 2) System.out.println("[" + number + "]");
        }
    }
}