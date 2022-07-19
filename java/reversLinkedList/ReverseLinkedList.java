import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);


        int size = list.size()-1;
        int y = size;
        System.out.println(list);
        for (int x= 0; x <=(size/2) ; x++){
            int last_value = list.get(y);
            int first_value = list.get(x);
            list.set(y,first_value);
            list.set(x,last_value);
            y--;
        }

        System.out.println(list);

    }
}
