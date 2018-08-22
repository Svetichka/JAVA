

 class Boook {
     private String author;
     private int year;
     private String title;
     private int pageNumber;

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setPageNumber(int pageNumber) {
         this.pageNumber = pageNumber;
     }


     public String getAuthor() {
         return this.author;
     }

     public int getYear() {
         return this.year;
     }

     public String getTitle() {
         return this.title;
     }

     public int getPageNumber() {
         return this.pageNumber;
     }
 }

     class BookDemo {

         public static void main(String[] args) {
             Boook book1 = new Boook();
             book1.setAuthor("Babushkin");
             book1.setYear(1970);
             book1.setTitle("Grandmother fairy-tales");
             book1.setPageNumber(150);
             System.out.println(book1.getAuthor());
             System.out.println(book1.getYear());
             System.out.println(book1.getTitle());
             System.out.println(book1.getPageNumber());


             Boook book2 = new Boook();
             book2.setAuthor("Dedushkin");
             book2.setYear(1980);
             book2.setTitle("Grandfather fairy-tales");
             book2.setPageNumber(250);
             System.out.println(book2.getAuthor());
             System.out.println(book2.getYear());
             System.out.println(book2.getTitle());
             System.out.println(book2.getPageNumber());


             Boook book3 = new Boook();
             book3.setAuthor("Colovjev");
             book3.setYear(1990);
             book3.setTitle("Russian fairy-tales");
             book3.setPageNumber(350);
             System.out.println(book3.getAuthor());
             System.out.println(book3.getYear());
             System.out.println(book3.getTitle());
             System.out.println(book3.getPageNumber());

         }
     }
