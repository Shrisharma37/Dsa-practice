//        *
//      * *
//    * * *
//  * * * *
//* * * * *
public class rotated_inverted_triangle {
    public static void main(String[] args) {
        int n = 5;

         
        for(int i = 0 ; i < n ; i++){
            //concept of inverted pyramid
            for(int j = n ; j > i ; j--){
                System.out.print("  ");
            }
            //concept of pyramid
            for(int k = 0 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
