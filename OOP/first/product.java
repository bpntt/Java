package OOP.first;

public class product {
    public String name; 
    public String brand;
    public double price;

    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
    void setPrice(double inputPrice){
       checkprice(inputPrice);;
    }
     double getPrice(){
        return price;
    }
    void checkprice(double inputprice){
                if (inputprice <= 0){
            price = 0;
        }
        else {
            price = inputprice;
        }
    }
    product(){
        this("product","pepsi", 100);

/*         brand = "noName";
        name = "noName";
        price = 0; */
    }
    product(String inputbrand, String inputname, double inputprice){
        checkprice(inputprice);
        brand = inputbrand;
        name = inputname;
        price = inputprice;
        
    }
    product(String inputname, double inputprice){
        brand = "NoName";
        name = inputname;
        price = inputprice;
        
    }
}
