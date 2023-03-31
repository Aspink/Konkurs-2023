public class LinkedFIFO<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedFIFO() {
        tail = null;
        head = null;
        size = 0;
    }
    public void add(T data) {
        Node<T> node = new Node<>(data);
        size++;
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public T poll() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
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
    public int size() {
        return size;
    }
}
