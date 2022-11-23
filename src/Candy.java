public class Candy extends BestSelling{

    private String brand;

    private String country;


    public Candy(String name, String year, int sales, String brand, String country) {
        super(name, year, sales);
        this.brand = brand;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void describeData(){
        System.out.println("This candy was made by " + brand + " in " + country);
    }
}
