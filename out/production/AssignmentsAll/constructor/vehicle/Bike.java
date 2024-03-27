package constructor.vehicle;

public class Bike extends Vehicle{
    private String bikeName;
    private int bokePrice;

    public Bike(String bikeName, int bokePrice) {
        this.bikeName = bikeName;
        this.bokePrice = bokePrice;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public int getBokePrice() {
        return bokePrice;
    }

    public void setBokePrice(int bokePrice) {
        this.bokePrice = bokePrice;
    }
}
