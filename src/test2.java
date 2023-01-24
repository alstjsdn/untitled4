public class test2 {
    public void factorial(int fac) {
        int answer = 1;
        for(int i=1; i<=fac; i++) {
            answer *= i;

        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        test2 test = new test2();
        test.factorial(7);
        test.factorial(5);




    }
}
