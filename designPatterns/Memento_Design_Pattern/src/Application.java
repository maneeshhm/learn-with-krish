public class Application {


    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Undo undo = new Undo();

        undo.addText(new TextFormat("hello1"));
        undo.addText(new TextFormat("hello2"));

        careTaker.save(undo);
        System.out.println(undo);


        undo.addText(new TextFormat("hello3"));
        careTaker.save(undo);
        System.out.println(undo);

        undo.addText(new TextFormat("hello4"));
        careTaker.save(undo);
        System.out.println(undo);

        careTaker.revert(undo);
        System.out.println(undo);

        careTaker.revert(undo);
        System.out.println(undo);
    }


}
