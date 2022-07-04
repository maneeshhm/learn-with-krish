public class Application {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Iphone iphone = (Iphone) registry.getPhone(PhoneType.IPHONE);
        System.out.println(iphone);

        iphone.setModel("Iphone 12");
        System.out.println(iphone);


    }
}
