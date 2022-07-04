import java.util.ArrayList;
import java.util.List;

public abstract class  Package {

    protected List<Travel> travelList= new ArrayList<>();

    public Package(){
        createPackage();
    }

    protected abstract void createPackage();

    @Override
    public String toString() {
        return travelList.toString();
    }
}
