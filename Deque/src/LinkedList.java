public class LinkedList <S> implements InterfaceLinkedList<S>{
    private Node<S> head;
    private Node<S> tail;
    public LinkedList(){
        head = null;
        tail = null;
    }
    @Override
    public void addFirst(S data) {
        Node<S> newNode = new Node<>(data);
        if (isEmpty()) { head = tail = newNode; }
        else {
            head.next = newNode;
            newNode.previous = head;
            head = newNode;
        }
    }

    @Override
    public void addLast(S data) {
        Node<S> newNode = new Node<>(data);
        if (isEmpty()) { head = tail = newNode; }
        else {
            newNode.next = tail;
            tail.previous = newNode;
            tail = newNode;
        }
    }

    @Override
    public S peekFirst() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return (S) head.data;
    }

    @Override
    public S peekLast() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return (S) tail.data;
    }

    @Override
    public S pollFirst() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        Node<S> current;
        current = head;
        head = head.previous;
        current.previous.next = null;
        current.previous = null;
        return (S) current.data;
    }

    @Override
    public S pollLast() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        Node<S> current;
        current = tail;
        tail = current.next;
        current.next.previous = null;
        current.previous = null;
        return (S) current.data;
    }

    public S showTailPrevious(){
        return (S) tail.previous.data;
    }

    public S showTailNext(){
        return (S) tail.next.data;
    }
    public S showHeadPrevious(){
        return (S) head.previous.data;
    }

    public S showHeadNext(){
        return (S) head.next.data;
    }

    @Override
    public void clearAll() {
        try {
            while (tail.next != null) {
                tail = tail.next;
                tail.previous.next = null;
                tail.previous = null;
            }
        }catch (NullPointerException ex){
            System.out.println("List is empty");;
        }
        tail = head = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public int size() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        Node<S> current = tail;
        int size = 1;
        try {
            while (current.next != null){
                size++;
                current = current.next;
            }
        }catch (NullPointerException ex){
            return 0;
        }
        return size;
    }

    @Override
    public Object[] toArray() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        Object[] array = new Object[size()];
        Node<S> current = head;
        for (int i = 0; i < array.length; i++){
            array[i] = current.data;
            current = current.previous;
        }
        return array;
    }

    @Override
    public boolean find(Object obj) throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        Node<S> current = tail;
        while (current.next != null){
            if (current.data.equals(obj)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        Node<S> current = head;
        while (current != null){
            buffer.append(current.data);
            buffer.append(' ');
            current = current.previous;
        }
        return buffer.toString();
    }
}
