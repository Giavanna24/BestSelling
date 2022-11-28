package edu.sla.bestselling;

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

    void describeSelf(){
        super.describeSelf();
        System.out.print("My name is " + Author + ", the book is in " + Language + " and the genre is " + Genre +".");
    }
}
