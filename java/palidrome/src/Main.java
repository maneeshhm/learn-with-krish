import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Character> list1 = new LinkedList();
        LinkedList<Character> list2 = new LinkedList();

        list1.add('A');
        list1.add('M');
        list1.add('M');
        list1.add('A');

        // linked list revers
        int size = list1.size()-1;
        int y = size;
        System.out.println(list1);
        for (int x= 0; x <=(size) ; x++){
            char last_value = list1.get(y);
            char first_value = list1.get(x);
            list2.set(y,first_value);
            list2.set(x,last_value);
            y--;
        }
        System.out.println(list2);

    }


}
