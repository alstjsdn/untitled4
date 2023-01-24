import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

    Scanner scan =new Scanner(System.in);
    int []arr=new int[10];
    int maxnum = 0;
    int value = 0;
		for(int i=0; i<10; i++) {
        System.out.println("숫자를 입력하시오:");
        arr[i] = scan.nextInt();
    }

    int []mode = new int[10];
		for(int ar:arr) {
        mode[ar]++;
    }

		for(int j=0; j<mode.length; j++) {
        if(mode[j]>maxnum) {
            maxnum = mode[j];
            value = j;
        }
    }

		System.out.print(value);
}
    }
