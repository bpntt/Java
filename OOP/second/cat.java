package OOP.second;

public class cat extends animal{
    private String color; 
    
    public cat(String name, String color) {
        super(name);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public cat(String name) {
        super(name);
        
    }
    @Override
    public void voice() {
    System.out.println("Meow");
    }
     
}
