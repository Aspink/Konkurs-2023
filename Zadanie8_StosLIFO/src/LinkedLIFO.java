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

}
