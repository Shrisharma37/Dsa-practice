package basic_maths;

public class count_digit {
    public static int countDigit(int n){
        int a=n;
        int count=0;
        while(a!=0){
            count++;
            a=a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(7589));
    }
}
