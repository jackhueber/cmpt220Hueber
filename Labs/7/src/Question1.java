//Question 10.3
public class Question1 {

	public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(4);
        System.out.println("The value of myInteger is " + myInteger.getValue());
        System.out.println("myInteger is even: " + myInteger.isEven());
        System.out.println("myInteger is odd: " + myInteger.isOdd());
        System.out.println("myInteger is prime: " + myInteger.isPrime());
        System.out.println("4 == 4: " + myInteger.equals(4));
        System.out.println("4 == 8: " + myInteger.equals(new MyInteger(8)));
        System.out.println("Parse int 123 string value == 123: " + MyInteger.parseInt("123"));
        System.out.println("Parse int 234 char array value == 234: " + MyInteger.parseInt(new char[]{'2', '3', '4'}));
    }

    private static class MyInteger {
        private final int value;

        MyInteger(int value) {
            this.value = value;
        }

        //Finds if value is even
        static boolean isEven(int value) {
            return value % 2 == 0;
        }

        static boolean isEven(MyInteger value) {
            return isEven(value.getValue());
        }

        //Finds if value is odd
        static boolean isOdd(int value) {
            return !isEven(value);
        }

        static boolean isOdd(MyInteger value) {
            return isOdd(value.getValue());
        }

        static boolean isPrime(int value) {
            for (int divisor = 2; divisor <= value / 2; divisor++) {
                if (value % divisor == 0) { // If true, value is not prime
                    return false; // Value is not a prime
                }
            }
            return true; // Value is prime
        }
        
        static boolean isPrime(MyInteger value) {
            return isPrime(value.getValue());
        }
        
        //Converts to integer value
        static int parseInt(char[] array) {
            int value = 0;
            for (int i = 0; i < array.length; i++) {
                value += (array[i] - '0') * Math.pow(10, array.length - i - 1);
            }
            return value;
        }
        
        static int parseInt(String value) {
            return Integer.parseInt(value);
        }

        int getValue() {
            return value;
        }

        boolean isEven() {
            return isEven(value);
        }

        boolean isOdd() {
            return isOdd(value);
        }

        boolean isPrime() {
            return isPrime(value);
        }

        boolean equals(int value) {
            return this.value == value;
        }

        boolean equals(MyInteger value) {
            return equals(value.getValue());
        }
    }

}