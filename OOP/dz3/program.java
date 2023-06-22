package OOP.dz3;

public class program {
    public static void main(String[] args) {
        apple apple1 = new apple();
        orange orange1 = new orange();
        box abox = new box<>();
        abox.add(apple1);
        System.out.println(abox);
    }
}
