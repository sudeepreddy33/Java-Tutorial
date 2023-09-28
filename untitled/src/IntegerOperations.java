public class IntegerOperations {

    public void swapNumbers(int a, int b) {
        System.out.println("before - a = " + a + " : b = " + b);

        b = b - a;
        a = b + a;

        System.out.println("after - a = " + a + " : b = " + b);
    }

    public String isPrime(int n) {
        String a = null;
        if (n == 0 || n == 1) {
            a = "enter number which is greater than 1";
        }
        if (n == 2) {
            a = n + " is prime number";
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                a = n + " is not a prime number";
            } else {
                a = n + " is a prime number";
            }

        }
        return a;
    }

    public String isEvenOrOdd(int n) {
        String a = null;
        if (n == 0) {
            a = "Enter number which is other than 0";
        }
        if (n % 2 == 0) {
            a = n + " is an even number";
        } else {
            a = n + " is an odd number";
        }
        return a;
    }

    public void printFibanocci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;
        }

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

    public void isPalindrome(int n){
        int a = n;

    }

}
