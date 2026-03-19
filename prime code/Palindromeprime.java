

import java.util.Scanner;

class Palindromeprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int den = 2;

        if (num <= 1) {
            System.out.println("It is NOT a PRIME NUMBER");
        } else {
            while (den <= num / 2) {
                if (num % den == 0) {
                    break;
                }
                den++;
            }
            if (den > num / 2) {
                // Reverse the number
                int rev = 0;
                for (int i = num; i != 0; i /= 10) {
                    rev = rev * 10 + (i % 10);
                }

                if (num == rev) {
                    System.out.println("It is a PALINDROMIC PRIME");
                } else {
                    System.out.println("It is NOT a PALINDROMIC PRIME");
                }
            } else {
                System.out.println("It is NOT a PRIME NUMBER");
            }
        }
    }
}
