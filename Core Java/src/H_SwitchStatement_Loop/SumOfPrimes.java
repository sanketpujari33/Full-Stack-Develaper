package H_SwitchStatement_Loop;

public class SumOfPrimes {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of prime numbers from 2 to 100 is: " + sum);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

