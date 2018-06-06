package com.ianl;

public class Main {
    public static int numbersSummed = 0;
    public static int sumOfAllNumbers = 0;
    public static final int MAX_NUMBERS_SUMMED = 5;

    public static void main(String[] args) {
	// write your code here
    //threeAndFiveSumChecker();
        System.out.println("Sum of odd numbers between 1, 100: "+sumOdd(1, 100));
        System.out.println("Sum of odd numbers between -1, 100: "+sumOdd(-1, 100));
        System.out.println("Sum of odd numbers between 100,100: "+sumOdd(100, 100));
        System.out.println("Sum of odd numbers between 100, -100: "+sumOdd(100, -100));
        System.out.println("Sum of odd numbers between 100, 1000: "+sumOdd(100, 1000));

    }

    public static void threeAndFiveSumChecker () {
        for(int i=1; i <= 1000; i++) {
            if(i%3 == 0) {
                if(i%5 == 0) {
                    // Could also write if(( i%3 == 0 ) && ( i%5 == 0) {...}
                    numbersSummed++;
                    sumOfAllNumbers+=i;
                    System.out.println(i+" is divisible by 3 and 5, adding ..");
                    if(numbersSummed == MAX_NUMBERS_SUMMED) {
                        System.out.println("Found "+ numbersSummed +" numbers divisible by 3 and 5, closing loop with a sum of: " + sumOfAllNumbers);
                        numbersSummed = 0;
                        sumOfAllNumbers = 0;
                        break;
                    }
                }
            }
        }
    }

    public static boolean isOdd(int number) {
        if(number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sumOfOddNumbers = 0;

        if((end >= start) && (start > 0)){
            for(int i=start; i<=end; i++) {
                if(isOdd(i)){
                    sumOfOddNumbers+=i;
                    //System.out.println(i+" is an odd number, adding to sum ..");
                }
            }
            return sumOfOddNumbers;
        }
        return -1;
    }
}
