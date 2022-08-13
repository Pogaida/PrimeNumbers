public class Numbers {
    public static void main(String[] args) {
        //generujemy liczbę
        for (int number = 2; number <= 1_000; number++) {
            //podajemy dzielnik na 1 ponieważ (liczba % 1 = liczba) zawsze jest prawdą
            int divider = 1;
            for (int i = number; i >= 2; i--) {
                //sprawdzmy czy liczba ma więcej niż jeden dzielnik
                if(number % i == 0) {
                    divider++;
                }
            }
            //jeśli liczba ma tylko dwa dzielniki (numer oraz 1) to jest to liczba pierwsza
            if(divider == 2){
                System.out.println("[" + number + "]");
            }
        }
    }
}