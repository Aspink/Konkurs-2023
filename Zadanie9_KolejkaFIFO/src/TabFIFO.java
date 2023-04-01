public class TabFIFO<T> {
    private int size = 0;
    private final int MAX_SIZE = 100;
    private Object[] tabQueue = new Object[MAX_SIZE];
    public void add(T data) {
        if(size == MAX_SIZE) {
            System.out.println("Wielkość kolejki przekroczona, nie można dodać elementu.");
        } else {
            tabQueue[size++] = data;
        }
    }
    public T poll() {
        T element = (T) tabQueue[0];
        for(int i = 0; i < size; i++) {
            tabQueue[i] = tabQueue[i+ 1];
        }
        size--;
        return element;
    }
    public T peek() {
        return (T) tabQueue[0];
    }


}
