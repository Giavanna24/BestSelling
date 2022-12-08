package edu.sla.bestselling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File text = new File("/Users/giavannarose/IdeaProjects/Best Selling/Books");
            Scanner scnr = new Scanner(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        new Candy("Reeses", 1923, 2603, "Reeses Peanut Butter Cups", "United States");
        new Books("A Tale of Two Cities", 1859, 200000000, "Charles Dicknens", "English", "Historical Fiction");

        for(BestSelling best: BestSelling.getAllBestSelling())
        System.out.println(best);
    }



}