import java.util.*;
public class Exmpl2 {

    public static void main(String[] args) {

        try {
            int arr[] = new int[9];
            arr[10] = 6;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println(" file moved to next data ");
        }
        System.out.println(" file moved to data ");
    }
}
