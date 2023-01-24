public class test {
    public static void main(String[] args){
        int num1 =25;
        int num2 =35;
        int min=Math.min(num1, num2);

        int avg= 1;

        for(int i=1; i<min/2; i++) {
            if(num1%i==0 && num2%i==0) {
                avg=i;
            }
        }

        System.out.print(avg);

    }
}
