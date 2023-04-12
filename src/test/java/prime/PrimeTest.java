package test.java.prime;

import main.java.prime.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PrimeTest {

    @Test
    void isPrimeTest() {
        Prime prime =new Prime();
        Assertions.assertTrue(prime.isPrime(7));
        Assertions.assertTrue(prime.isPrime(97));
        Assertions.assertTrue(prime.isPrime(13));
        Assertions.assertTrue(prime.isPrime(17));
        Assertions.assertFalse(prime.isPrime(4));
        Assertions.assertFalse(prime.isPrime(33));
        Assertions.assertFalse(prime.isPrime(21));
    }
}