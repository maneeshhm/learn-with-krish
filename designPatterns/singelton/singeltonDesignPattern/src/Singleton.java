public class Singleton {

    private static Singleton printSomething;

    private Singleton(){

    }

    public static Singleton getPrintSomething(){

        if (printSomething == null){
            //double checking singleton
            synchronized (Singleton.class){
                if(printSomething == null){
                    printSomething = new Singleton();
                }
            }
        }

        return printSomething;
    }



}
