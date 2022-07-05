import java.util.Stack;

public class CareTaker {

    Stack<Undo.UndoMemento> history = new Stack<>();

    public void save(Undo undo){
        history.push(undo.save());
    }

    public void revert(Undo undo){
        if (!history.isEmpty()){
            undo.revert(history.pop());
        }
        else
            System.out.println("Cannot undo");
    }



}
