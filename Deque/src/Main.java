import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<HeavyBox> test = new LinkedList<>();

        for (int i = 0; i < 7; i++){
            test.addFirst(new HeavyBox());
        }

        /*HeavyBox box = new HeavyBox(666.66);
        HeavyBox box1 = new HeavyBox(666.66);
        HeavyBox box1 = new HeavyBox(765.43);
        test.addLast(box);
        System.out.println(test.find(box1));*/

        /*try{
            System.out.println(Arrays.toString(test.toArray()));
        }catch (NullPointerException ex){
            System.out.print(ex.getMessage());
        }*/

        //System.out.println(test);

        /*try {
            System.out.println(test.size());
        }catch (NullPointerException ex){
            System.out.print(ex.getMessage());
        }*/

        /*try{
            System.out.println(test.peekFirst());
        }catch (NullPointerException ex){
            System.out.print(ex.getMessage());
        }*/

        //System.out.println("Show first: "+test.peekFirst());
        //System.out.println("Show last: "+test.peekLast());
        //System.out.println("Show head.previous: "+test.showHeadPrevious());
        //System.out.println("Show head.next: "+test.showHeadNext());
        //System.out.println("Show tail.previous: "+test.showTailPrevious());
        //System.out.println("Show tail.next: "+test.showTailNext());
        //System.out.println("Show and remove first: "+test.pollFirst());
        //System.out.println("Show first: "+test.peekFirst());
        //System.out.println("Show and remove last: "+test.pollLast());
        //System.out.println("Show last: "+test.peekLast());
        //System.out.println(test);
        //System.out.println("Show last: "+test.peekLast());


    }
}