public class Application {

    public static void main(String[] args) {
        Pizza.Builder builder = new Pizza.Builder("added Flour");

        Pizza pizza = builder.addChiken("Chicken added").addChees("chees added").addMashrooms("Mashroom added").build();
        System.out.println(pizza);
    }
}
