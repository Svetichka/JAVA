

public class Book {

    private String author;
    private int year;
    private String Title;
    private int pageAmount;

    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getTitle() {
        return Title;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public Book(String author, String Title, int year, int pageAmount) {
        this.Title = Title;
        this.author = author;
        this.year = year;
        this.pageAmount = pageAmount;
    }

    @Override

    public String toString() {
        return "Title: " + this.Title + " author : " + this.author + ", year: " + this.year + ", pages: " + this.pageAmount;
    }


    public Boolean Equals (Book book){

        if (((this.Title).equals(book.Title))&&((this.author).equals(book.author))

                &&(this.pageAmount==book.pageAmount)&&(this.year==book.year)){

            return true;

        }else {

            return false;

        }

    }

}


  class Main {

    public static void main(String[] args) {

        Book fairyTales = new Book("Aleksandr Pushkin", "Fairy-tales", 2009, 500);
        System.out.println(fairyTales);
        Book fables = new Book("Ivans Krilov", "Fables", 2010, 231);
        System.out.println(fables);
        Book compositions = new Book("Ivan Turgenev", "Compositions", 2009, 235);
        System.out.println(compositions);
        if (fairyTales.Equals(fairyTales)){
            System.out.println( fairyTales + " it's the same book as " + fairyTales);
        }
        if (fairyTales.equals(fables)){
            System.out.println(fairyTales + " it's the same book as " + fables);
        }else {
            System.out.println(fables + " it's different book as " + compositions);
        }
    }

}
