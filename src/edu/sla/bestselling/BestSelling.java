package edu.sla.bestselling;

import java.util.ArrayList;

public class BestSelling {
    private static ArrayList<BestSelling> allBestSelling = new ArrayList<>();

        private  String name;
        private  int year;
        private  int sales;


    public BestSelling(String name, int year, int sales) {
        this.name = name;
        this.year = year;
        this.sales = sales;
        allBestSelling.add(this);
    }

    public static ArrayList<BestSelling> getAllBestSelling() {
        return allBestSelling;
    }

    public static void setAllBestSelling(ArrayList<BestSelling> allBestSelling) {
        BestSelling.allBestSelling = allBestSelling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
