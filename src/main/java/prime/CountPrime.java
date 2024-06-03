package main.java.prime;

public class CountPrime {
    public static final long MEGABYTE = 1024 * 1024;
    public static long bytesToMegabyte(long bytes) {
        return bytes / MEGABYTE;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int countPrime = 1;
        int lastPrime = 0;
        Runtime runtime = Runtime.getRuntime();
        for (int i = 3; i < 10; i += 2) {
            Prime prime = new Prime();
            if (prime.isPrime(i)) {
                countPrime++;
                lastPrime = i;
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("count: "+countPrime);
        System.out.println("last: "+lastPrime);
        System.out.println("duration: "+duration/1000);
        System.out.println("Free Memory: "+bytesToMegabyte(runtime.freeMemory()));
        System.out.println("Total: "+bytesToMegabyte(runtime.totalMemory()));
        System.out.println("memory: "+ bytesToMegabyte(runtime.totalMemory()- runtime.freeMemory()));
    }
}
