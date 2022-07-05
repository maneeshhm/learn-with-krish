import java.util.ArrayList;

public class Undo {

    ArrayList<TextFormat> textFormats = new ArrayList<>();

    public void addText(TextFormat textFormat){
        textFormats.add(textFormat);
    }

    public ArrayList<TextFormat> getTextFormats() {
        return (ArrayList) textFormats.clone();
    }

    public UndoMemento save(){
        return new UndoMemento(getTextFormats());
    }

    public void revert(UndoMemento undoMemento){
        textFormats = undoMemento.getTextFormats();
    }

    @Override
    public String toString() {
        return "Undo{" +
                "textFormats=" + textFormats +
                '}';
    }

    static class UndoMemento{

        ArrayList<TextFormat> textFormats;


        private ArrayList<TextFormat> getTextFormats() {
            return textFormats;
        }

        public UndoMemento(ArrayList<TextFormat> textFormats) {
            this.textFormats = textFormats;


        }
    }
}
