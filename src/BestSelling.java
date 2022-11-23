public class BestSelling {
     private String name;
    private String year;
    private int sales;

    public BestSelling(String name, String year, int sales) {
        this.name = name;
        this.year = year;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    void describeSelf(){
        System.out.println("The best selling item is " + name + " it was made in " + year + " and had " + sales + " sales. ");
    }
}
