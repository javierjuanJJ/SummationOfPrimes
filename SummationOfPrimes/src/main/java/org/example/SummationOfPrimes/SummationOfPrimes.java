package org.example.SummationOfPrimes;

public class SummationOfPrimes {
    public static boolean isPrimeNumber(long number) {
        boolean isPrimeNumber = false;

        for (int counter = 2; counter < number && !isPrimeNumber; counter++) {
            // System.out.println(number % counter);
            isPrimeNumber = number % counter == 0;
        }

        return !isPrimeNumber;
    }

    public static int listPrimeNumber(int numberLenghtList){
        // int counter = 2;
        int counter = 900000;
        int numberListPrimes = 0;

        while (counter < numberLenghtList){


            if (isPrimeNumber(counter)){

                //System.out.print(counter + " + ");
                numberListPrimes += counter;
            }
            counter++;
        }
        //System.out.println();
        return numberListPrimes;
    }
}
