package test.java.prime;

import main.java.prime.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PrimeTest {

    private static final int[] sample_primes = {3, 7, 11, 19, 23, 29, 31, 37, 41, 47, 1021};
    private static final int[] sample_composites = {4, 14, 25, 35, 42, 96, 100, 150, 210, 500, 1002};

    @Test
    void isPrimeTest() {
        Prime prime = new Prime();
        for (int s :
                sample_primes)
            Assertions.assertTrue(prime.isPrime(s));
    }

    @Test
    void isCompositeTest() {
        Prime prime = new Prime();
        for (int p :
                sample_composites)
            Assertions.assertFalse(prime.isPrime(p));
    }
}