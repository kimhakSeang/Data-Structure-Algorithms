import java.util.Scanner;

public class StaticInitClass {

       private static boolean flag = true;
       private static int B = -1;
       private static int H = 3;


//        {
//           if((B<0 && B>100) || (H<0 && H>100)){
//               try {
//                   throw new Exception("Breadth and height must be positive");
//               } catch (Exception e) {
//                   throw new RuntimeException(e);
//               }
//           }
//       }

    static {
        Scanner inputB = new Scanner(System.in);
        B = inputB.nextInt();

        Scanner inputH = new Scanner(System.in);
        H = inputH.nextInt();

        if( B<0 || B>100 || H<0 || H>100){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
//        public StaticInitClass() throws Exception {
//
//        }

        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main



}
