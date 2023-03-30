public class LinkedLIFO<T> {
    private Node<T> head;
    private static class Node<T> {
        private T data;
        private Node<T> previous;
        public Node(T data) {
            this.data = data;
            this.previous = null;
        }
    }
    public LinkedLIFO() {
        head = null;
    }
    public void push(T data) {
        Node<T> node = new Node<>(data);
        if(head == null) {
            head = node;
        } else {
            node.previous = head;
            head = node;
        }
    }
    public T pop() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.previous;
        return data;
    }
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
