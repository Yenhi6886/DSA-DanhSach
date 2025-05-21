public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }
    public boolean add(E o){

    }
    public E remove(int index) {

    }

    public int size() {

    }
    public E clone() {

    }
    public boolean contains(E o) {

    }
    public int indexOf(E o) {

    }
    public void ensureCapacity(int minCapacity) {

    }
    public E get(int i) {

    }
    public void clear() {

    }
}
