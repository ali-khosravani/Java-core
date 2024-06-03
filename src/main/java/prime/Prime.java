package main.java.prime;

public class Prime {
    boolean flag = true;
    public boolean isPrime(int number) {
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
