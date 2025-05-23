import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAUT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAUT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if(size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if(i>= size|| i<0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }
}
