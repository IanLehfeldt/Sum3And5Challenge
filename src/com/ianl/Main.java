package com.ianl;

public class Main {
    public static int numbersSummed = 0;
    public static int sumOfAllNumbers = 0;
    public static final int MAX_NUMBERS_SUMMED = 5;

    public static void main(String[] args) {
	// write your code here

        for(int i=1; i <= 1000; i++) {
            if(i%3 == 0) {
                if(i%5 == 0) {
                    numbersSummed++;
                    sumOfAllNumbers+=i;
                    System.out.println(i+" is divisible by 3 and 5, adding ..");
                    if(numbersSummed == MAX_NUMBERS_SUMMED) {
                        System.out.println("Found "+ numbersSummed +" numbers divisible by 3 and 5, closing loop with: " + sumOfAllNumbers);
                        numbersSummed = 0;
                        sumOfAllNumbers = 0;
                        break;
                    }
                }
            }
        }
    }
}
