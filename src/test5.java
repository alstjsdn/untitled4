import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int num = scan.nextInt();
        int arr[][] = new int[num][num];
        int add =1;
        for(int i=0; i<num; i++) {
            if(i%2!=0) {
                for(int j=num-1; j>=0; j--) {
                    arr[i][j] = add;
                    add++;
                }
            }else {
                for(int j=0; j<num; j++) {
                    arr[i][j] =add;
                    add++;
                }
            }
        }
        for (int j=0; j<num; j++) {
            for(int k=0; k<num; k++) {
                System.out.print(arr[j][k]);
            }
            System.out.println("");
        }


    }
}
