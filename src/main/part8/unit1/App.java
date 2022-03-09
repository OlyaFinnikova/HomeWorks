package part8.unit1;

import part8.unit1.ListStack;

public class App {

    public static void main(String[] args) {


        ListStack list = new ListStack();
        list.push("С");
        list.push("В");
       list.push(3);
        list.print();
        list.poll();
       list.print();
    }
}
