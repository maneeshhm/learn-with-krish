public class GoldPackage extends Package{

    @Override
    protected void createPackage() {
        travelList.add(new Hiking());
        travelList.add(new Camping());

    }
}
