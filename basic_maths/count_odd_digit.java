
public class count_odd_digit {
    public static int countOddDigit(int n) {
        int a=n,count=0;
        while(a!=0){
            if((a%10)%2!=0){
                count++;
            }
            a=a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigit(5789237));
    }
}
