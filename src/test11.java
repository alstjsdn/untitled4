import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num1 = scan.nextInt();
        System.out.print("숫자 입력 :");
        int num2 = scan.nextInt();
        int sum = 1;
        for(int i=0; i<num2; i++) {
            sum *= num1;

        }
        System.out.print(sum);

    }
}
