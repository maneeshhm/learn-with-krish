public class Application {

    public static void main(String[] args){

        Package aPackage = PackageFactory.createPackage(PackageCode.SILVER);
        System.out.println(aPackage);

        Package aPackage2 = PackageFactory.createPackage(PackageCode.GOLD);
        System.out.println(aPackage2);
    }
}
