import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BestSelling> allBestSelling = new ArrayList<>();
        Candy Reeses = new Candy("Reeses", 1923, 2603, "Reeses Peanut Butter Cups", "United States");
        allBestSelling.add(Reeses);
        Books ATaleOfTwoCities = new Books("A Tale of Two Cities", 1859, 200000000, "Charles Dicknens", "English", "Historical Fiction");
        allBestSelling.add(ATaleOfTwoCities);

        System.out.println();
        for (BestSelling item: allBestSelling) {
            item.describeSelf();
        }
    }


}