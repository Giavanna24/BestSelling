package edu.sla.bestselling;

public class Candy extends BestSelling{

    private String brand;

    private String country;


    public Candy(String name, int year, int sales, String brand, String country) {
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

    @Override
    public String toString() {
        return " The best selling item is " + getName() + ". This candy was made by " + brand  +
                " in " + country  + ". It was made in "  + getYear() + ". It had " + getSales() + " sales."
                ;
    }
}
