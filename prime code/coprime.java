import java.util.Scanner;
class Coprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number 1");
        int n1 = sc.nextInt();

        System.out.println("enter a number 2");
        int n2 = sc.nextInt();

        // declare and initialize small
        int small = (n1 < n2) ? n1 : n2;

        while(true){
            if (n1 % small == 0 && n2 % small == 0){
                break;
            }
            small--;
        }

        if(small == 1){
            System.out.println("they are co-prime");
        } else {
            System.out.println("they are not co-prime");
        }
    }
}
