public class Pizza {

    private final String addFlour;
    private final String addChiken;
    private final String addChees;
    private final String addMashrooms;
    private final String addSausage;
    private final String addBeef;

    public Pizza(Builder builder){
        this.addFlour = builder.addFlour;
        this.addChiken = builder.addChiken;
        this.addChees = builder.addChees;
        this.addMashrooms = builder.addMashrooms;
        this.addBeef = builder.addBeef;
        this.addSausage = builder.addSausage;
    }

    static class Builder{

        private String addFlour;
        private String addChiken;
        private String addChees;
        private String addMashrooms;
        private String addSausage;
        private String addBeef;

        public Pizza build(){
            return new Pizza(this);
        }

        public Builder(String addFlour){
            this.addFlour = addFlour;
        }

        public Builder addChiken(String addChiken){
            this.addChiken = addChiken;
            return this;

        }
        public Builder addChees(String addChees){
            this.addChees = addChees;
            return this;

        }

        public Builder addMashrooms(String addMashrooms){
            this.addMashrooms = addMashrooms;
            return this;

        }

        public Builder addSausage(String addSausage){
            this.addSausage = addSausage;
            return this;

        }

        public Builder addBeef(String addBeef){
            this.addBeef = addBeef;
            return this;

        }


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "addFlour='" + addFlour + '\'' +
                ", addChiken='" + addChiken + '\'' +
                ", addChees='" + addChees + '\'' +
                ", addMashrooms='" + addMashrooms + '\'' +
                ", addSausage='" + addSausage + '\'' +
                ", addBeef='" + addBeef + '\'' +
                '}';
    }
}
