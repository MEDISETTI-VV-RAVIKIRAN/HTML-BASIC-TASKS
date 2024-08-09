public class TwoDmnsl {

    public static void main(String [] args ){

        int[][] s = new int[2][3];

    s [0][0]  =25 ;
    s [0][1]  =35 ;
    s [0][2]  = 45;
    s [1][0]  =65 ;
    s  [1][1] =75 ;
    s  [1][2] =85 ;

        for (int i=0;i<s.length;i++){
            int [] singleR = s[i];
            for (int j=0;j<singleR.length;j++){

                System.out.println(singleR[j]+"  ");

            }
            System.out.println();
        }
    }
}
