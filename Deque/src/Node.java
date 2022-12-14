public class Node <S> {
    public Node(){}
    public Node(S data){
        this.data = data;
    }
    public Node(S data, int index){
        this.index = index;
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    int index;
    S data;
    Node<S> next;
    Node<S> previous;
}
