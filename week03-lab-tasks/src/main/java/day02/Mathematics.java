package day02;

public class Mathematics {
    public static void main(String[] args) {
        int number = 19;
        System.out.println("isPrime(" + number + "): " + isPrime(number));
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }
}
