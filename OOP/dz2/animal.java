package OOP.dz2;

public class animal {
    protected String name;
    protected int hungerBar;
    protected int  hunger;





 public animal(String name, int hungerBar, int hunger) {
        this.name = name;
        this.hungerBar = hungerBar;
        this.hunger = hunger;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

}
    public int getHungerBar(){
        return hungerBar;
    }
    public void setHungerBar(int hungerBar){
        this.hungerBar = hungerBar;
    }
        public int getHunger(){
        return hunger;
    }
    public void setHunger(int hungerBar){
        this.hungerBar = hunger;
    }

  public String displayInfo(){
        return String.format("%s - %f - %f", name, hungerBar, hunger);
    }
    public void eatFood(int hunger, int hungerBar, int food){
    if (hunger < hungerBar ){
      System.out.println("Wanna eat");
      hungerBar = food - (hunger - hungerBar);
      System.out.println("Happy");
    }
    else {
        System.out.println("dont want eat");
    }

}}