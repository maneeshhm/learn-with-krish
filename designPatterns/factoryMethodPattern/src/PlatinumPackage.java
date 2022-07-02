public class PlatinumPackage extends Package{
    @Override
    protected void createPackage() {
        travelList.add(new WaterRafting());
        travelList.add(new Hiking());
        travelList.add(new Camping());
    }
}
