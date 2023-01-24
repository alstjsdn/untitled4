import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int num =scan.nextInt();
        int i =1;
        for (int j=0; j<num; j++) {
            for(int k=0; k<num; k++) {
                System.out.print(i+" ");
                i++;
            }
            System.out.println("");
        }

    }
}
