import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num = scan.nextInt();

        for(int i=1; i<=num; i++) {
            for(int k=0; k<num-i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}