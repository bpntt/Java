package OOP.first;

public class botle extends product {
    private int volume;

    public botle(String name, double price) {
        super(name, price);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public botle(String brand, String name, double price, int volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[botle] %s - %s -%f -[volume:%d] ", brand, name, price, volume);
    }
}
