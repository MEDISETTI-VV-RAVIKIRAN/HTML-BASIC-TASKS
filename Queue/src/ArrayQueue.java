import java.util.ArrayDeque;

public class ArrayQueue {
    public static void main(String[] args) {

        ArrayDeque<String> jk= new ArrayDeque<>();

        jk.offer("ravi");
        jk.offerLast("raju");
        jk.offer("sai");
        jk.offer("kiran");
        jk.offerFirst("kasi");
        jk.offer("suresh");

        System.out.println(jk);
        jk.pollFirst();
        System.out.println(jk);
        jk.pollLast();
        System.out.println(jk);
        jk.offerLast("pinky");
        System.out.println(jk);

        System.out.println(jk.peek());
        System.out.println(jk);
        System.out.println(jk.poll());
        System.out.println(jk);



    }
}
