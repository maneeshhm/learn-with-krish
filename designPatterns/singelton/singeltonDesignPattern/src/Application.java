public class Application {

    public static void main(String[] args){

        Singleton printer = Singleton.getPrintSomething();
        System.out.println(printer);

        Singleton print2 = Singleton.getPrintSomething();
        System.out.println(print2);
    }
}
