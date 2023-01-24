public class test3 {
    public void sum(int num) {
        int answer = 0;
        while(num>0) {
            answer += num%10;
            num /= 10;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        test3 test = new test3();
        test.sum(1531);
        test.sum(1551);

    }
}
