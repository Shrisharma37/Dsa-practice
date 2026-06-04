//           *                  i=0 stars=1 spaces=4
//         * * *                i=1 stars=3 spaces=3
//       * * * * *              i=2 stars=5 spaces=2
//     * * * * * * *            i=3 stars=7 spaces=1
//   * * * * * * * * *          i=4 stars=9 spaces=0
public class triangle_pattern{
    public static void main(String[] args) {
        int n = 5;
        int stars = 1;
        int spaces = n-1;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < spaces ; j++){
                System.out.print("  ");
            }
            for(int k = 0 ; k < stars ; k++){
                System.out.print("* ");
            }
            System.out.println();
            stars += 2;
            spaces -= 1;
        }
    }
    
}
