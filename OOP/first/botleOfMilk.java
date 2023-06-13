package OOP.first;

public class botleOfMilk extends product {
    private int volume;
    private int fat;
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getFat(){
        return fat;
    }
    public void setFat(int fat){
        this.volume = fat;
    }
    public botleOfMilk(String brand, String name, double price, int volume, int fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }
    public String displayInfo() {
        return String.format("[botle] %s - %s -%f -[volume:%d, fat: %d] ", brand, name, price, volume, fat);
    }
}
