package edu.sla.bestselling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //File text = new File("Stuff");
       // Scanner scnr = new Scanner(text);

        new Candy("Reeses", 1923, 2603, "Reeses Peanut Butter Cups", "United States");
        new Books("A Tale of Two Cities", 1859, 200000000, "Charles Dicknens", "English", "Historical Fiction");

        for(BestSelling best: BestSelling.getAllBestSelling())
        System.out.println(best);
    }



}