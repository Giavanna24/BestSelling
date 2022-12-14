package edu.sla.bestselling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Candy extends BestSelling {

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
        return " The best selling item is " + getName() + ". This candy was made by " + brand +
                " in " + country + ". It was made in " + getYear() + ". It had " + getSales() + " sales."
                ;
    }
    public static void eat() {
        Scanner sc = null;
        try {
            File text = new File("Candy");
            sc = new Scanner(text);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                String name = lineScanner.next();
                int year = lineScanner.nextInt();
                int sales = lineScanner.nextInt();
                String brand = lineScanner.next();
                String country = lineScanner.next();
                new Candy(name,year,sales,brand,country);



                while(lineScanner.hasNext()) {
                    String chunkoData = lineScanner.next();
                    System.out.println(chunkoData);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) sc.close();
        }
    }
}