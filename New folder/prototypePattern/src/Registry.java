import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<PhoneType , Phones> phones = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Phones getPhone(PhoneType phoneType){
        Phones phone = (Phones) phones.get(phoneType).clone();
        return phone;
    }

    private void initialize() {
        Iphone iphone = new Iphone();
        iphone.setRamCapasity("4GB");
        iphone.setStoragCapasity("64GB");
        iphone.setOsVersion("Ios 15");

        Samsung samsung = new Samsung();
        samsung.setRamCapasity("8GB");
        samsung.setStoragCapasity("128GB");
        samsung.setOsVersion("android Snow cone");

        phones.put(PhoneType.IPHONE,iphone);
        phones.put(PhoneType.SAMSUNG,samsung);
    }
}
