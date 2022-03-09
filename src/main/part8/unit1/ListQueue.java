package part8.unit1;

public class ListQueue<T> {

    private Element first = null;

    public void push(T value) {

        Element newElement = new Element(value);

        if(first==null){
            first=newElement;
        }else {
        Element currentElement =first;
        while (currentElement.getNext() != null) {
            currentElement=currentElement.getNext();
        }
        currentElement.setNext(newElement);
        }
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
