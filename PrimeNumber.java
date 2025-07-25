//WAP to check the given number is prime or not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;  //initialize isPrime as true

        if (num <= 1) {     //any number which is entered is 1 or less then 1 it is not a prime
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {    //if condition is false then it is a prime number ,it skips the loop and prints the statement 
                if (num % i == 0) {   //if the above condition is true and this condition is false then it jumps out of the loop
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
        
        sc.close();
    }
}
