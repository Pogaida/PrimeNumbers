public class Numbers {
    public static void main(String[] args) {
        //generujemy liczbę
        long alfaTime = System.currentTimeMillis();
        for (int number = 2; number <= 100_000; number++) {
            int divider = 0;
            for (int i = 1; i <= number; i++) {
                //sprawdzmy ile liczba ma dzielników
                if(number % i == 0) divider++;

                //jeśli ma więcej niż 2 dzielniki przerywa pętlę (przyspiesza program)
                if(divider > 2 && i < number) break;
            }
            //jeśli liczba ma 2 dzielniki wypisujemy liczbę
            if(divider == 2) System.out.println("[" + number + "]");
        }
        long omegaTime = System.currentTimeMillis() - alfaTime;
        //czas działania programu w sekundach
        System.out.println("Time: " + omegaTime / 1000 + "sek");
    }
}