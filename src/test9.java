import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num = scan.nextInt();

        for(int i=num; i>=1; i--) {

            if(i!=num) {
                for(int k=0; k<num-i; k++) {
                    System.out.print(" ");
                }
            }
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}