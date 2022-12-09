package edu.sla.bestselling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Books extends BestSelling{
    private String Author;
    private String Language;
    private String Genre;

    public Books(String name, int year, int sales, String author, String language, String genre) {
        super(name, year, sales);
        Author = author;
        Language = language;
        Genre = genre;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        return
                " The best selling item is " + getName() + ", the authors name is " + Author +
                ", the book is in " + Language +
                " and the genre is " + Genre + ". It was made in "  + getYear() + ". It had " + getSales() + " sales."
                ;
    }
    public static void Read () throws Exception{
        File text = new File("Books");
        Scanner sc = new Scanner(text);

        while(sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
}
