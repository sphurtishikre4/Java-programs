
    import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int den = 2;

        if (num <= 1) {
            System.out.println("It is not a Prime Number");
        } else {
            while (den <= num / 2) {
                if (num % den == 0) {
                    break;
                }
                den++;
            }

            if (den > num / 2) {
                System.out.println("It is a Prime Number");
            } else {
                System.out.println("It is not a Prime Number");
            }
        }
    }
}
