import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<HeavyBox> test = new LinkedList<>();
        LinkedList<HeavyBox> test1 = new LinkedList<>(new HeavyBox(), new HeavyBox(), new HeavyBox(), new HeavyBox());

        /*for (int i = 0; i < 7; i++){
            test.addFirst(new HeavyBox());
        }*/

        for (int i = 0; i < 7; i++){
            test.addFirstIndex(new HeavyBox());
        }

        System.out.println(test);

        try{
            test.add(1, new HeavyBox());
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        /*try{
            System.out.println(test.get(5));
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }*/

        System.out.println(test);

        /*try{
            test.sortedNodeIndex();
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }*/

        /*System.out.println(test.showHeadNodeIndex());
        System.out.println(test.showTailNodeIndex());*/

        /*try {
            System.out.println(test.get(1));
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }*/


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

        try {
            System.out.println("Show first: " + test.peekFirst());
            System.out.println("Show last: " + test.peekLast());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

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