
public class prime{
    public static void main(String[] args) {
    int number = 21; // Change this number to check for prime
    boolean isPrime = true;
    if (number <= 1) {
    isPrime = false;
    } else {
    for (int i = 2; i <= Math.sqrt(number); ++i) {
    if (number % i == 0) {
    isPrime = false;
    break;
    }
    }
    }
    if (isPrime) {
    System.out.println(number + " is a prime number.");
    } else { System.out.println(number + " is not a prime number.");
}
}}