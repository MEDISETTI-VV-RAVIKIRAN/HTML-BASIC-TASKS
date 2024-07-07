import java.util.PriorityQueue;

public class Queueprtc {

    public static void main(String[] args) {

        PriorityQueue<Integer> i = new PriorityQueue<>();

        i.offer(25);
        i.offer(35);
        i.offer(45);
        i.offer(55);

        System.out.println(i);
        System.out.println(i.peek());
        System.out.println(i.poll());
        System.out.println(i);
        System.out.println(i.poll());
        System.out.println(i);
        i.add(33);
        System.out.println(i);

        PriorityQueue<String> j = new PriorityQueue<>();

        j.offer("Ravi");
        j.offer("Manikishore");
        j.offer("Sanjay");
        j.offer("G.N.S");
        j.offer("Mani");

        System.out.println(j);
        System.out.println(j.peek());
        System.out.println(j);
        System.out.println(j.poll());
        System.out.println(j);
        System.out.println(j.offer("satish"));
        System.out.println(j);
        System.out.println(j.poll());
        System.out.println(j);





    }

}
