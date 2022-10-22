public interface InterfaceLinkedList <S> {
    void addFirst(S data);
    void addLast(S data);
    S peekFirst();
    S peekLast();
    S pollFirst();
    S pollLast();
    void clearAll();
    boolean isEmpty();
    int size();
    Object[] toArray();
    boolean find(Object obj);

}
