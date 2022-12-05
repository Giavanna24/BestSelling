package edu.sla.bestselling;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        new Candy("Reeses", 1923, 2603, "Reeses Peanut Butter Cups", "United States");
        new Books("A Tale of Two Cities", 1859, 200000000, "Charles Dicknens", "English", "Historical Fiction");

             System.out.println(BestSelling.getAllBestSelling());
    }


}