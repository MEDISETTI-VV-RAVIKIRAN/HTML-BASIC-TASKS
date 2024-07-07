public class Twdms2 {

    public static void main(String[] args) {

        int[][] arr1 = new int[2][4];

        arr1[0][0] = 13;
        arr1[0][1] = 16;
        arr1[0][2] = 19;
        arr1[0][3] = 12;

        arr1[1][0] = 15;
        arr1[1][1] = 18;
        arr1[1][2] = 21;
        arr1[1][3] = 24;


        for (int i = 0; i < arr1.length; i++) {

             int[] singlerow = arr1[i];

         for ( int j = 0; j<singlerow.length;j++) {

             System.out.print(singlerow [j] + " ");
         }
            System.out.println(   );

        }
    }
}
