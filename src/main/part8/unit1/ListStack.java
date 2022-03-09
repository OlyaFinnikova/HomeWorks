package part8.unit1;

public class ListStack<T> {

    private Element first = null;

    public void push(T value) {
        Element newFirst = new Element<>(value);
        newFirst.next=first;
        first=newFirst;
    }

    public Element poll() {
       while (!isEmpty()) {
           Element oldFirst = first;
           first = first.next;
           return oldFirst;
       }
       return null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void print() {
        Element currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}
