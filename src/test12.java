import java.util.Scanner;

public class test12 {

    public static int jjac(int i) {
        int cnt= 0;

        while(i>0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                cnt++;
                i /= 10;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num = scan.nextInt();

        for(int i=1; i<=num; i++) {
            int cn = jjac(i);
            if(cn!=0) {
                for(int k=0; k<cn; k++) {
                    System.out.print("짝 ");
                }
            }else
                System.out.print(i+" ");
        }
    }
}
