package part10.unit1;

public class DataType<T> {

    private T value;

    public DataType(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
