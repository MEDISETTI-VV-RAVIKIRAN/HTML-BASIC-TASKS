public class Tdexmpl2 {

    public static void main(String[] args) {

        int[][] s = {{3, 5}, {5, 6}, {6, 7}};

        int size=0;
        for (int i=0;i<s.length;i++) {


            for ( int j = 0; j < s[i].length; j++) {
                System.out.println(s[i][j] + " ");
            }


        }
        System.out.println();
    }
}