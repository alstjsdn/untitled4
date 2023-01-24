import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int num = scan.nextInt();
        int arr[][] = new int[num][num];
        int add = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[j][i] = add;
                add++;
            }
        }
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(arr[j][k]);
                }
                System.out.println("");
            }


        }
    }

