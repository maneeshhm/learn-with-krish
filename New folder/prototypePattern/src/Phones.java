public abstract class Phones implements Cloneable{

    private String ramCapasity;
    private String storagCapasity;
    private String osVersion;

    public String getRamCapasity() {
        return ramCapasity;
    }

    public void setRamCapasity(String ramCapasity) {
        this.ramCapasity = ramCapasity;
    }

    public String getStoragCapasity() {
        return storagCapasity;
    }

    public void setStoragCapasity(String storagCapasity) {
        this.storagCapasity = storagCapasity;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "ramCapasity='" + ramCapasity + '\'' +
                ", storagCapasity='" + storagCapasity + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }

    @Override
    public Phones clone() {
        try {
            Phones clone = (Phones) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
