package edu.sla.bestselling;


public class Main {

    public static void main(String[] args) throws Exception{

        new Candy("Reeses", 1923, 2603, "Reeses Peanut Butter Cups", "United States");
        new Books("A Tale of Two Cities", 1859, 200000000, "Charles Dicknens", "English", "Historical Fiction");

        for (BestSelling best : BestSelling.getAllBestSelling())
            System.out.println(best);
        Books.Read();
        Candy.eat();
    }
}