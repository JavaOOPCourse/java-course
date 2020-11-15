public class Book {

    public String title;
    public String author;
    public String publisher;
    public int year;
    public boolean borrowed;

    //constructor
    public Book(String title, String author, int year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    //accessor methods to return the inputted values from the user (in this case the librarian to save the book details)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    //mutator methods to update the information saved above
    public void setTitle() {
        this.title = title;
    }

    public void setAuthor() {
        this.author = author;
    }

    public void setPublisher() {
        this.publisher = publisher;
    }

    public void setYear() {
        this.year = year;
    }

    /**
     * @return the book information as a whole
     */
    public String toString() {
        return title + ", " + author + ", " + publisher + ", " + year;
    }

    public boolean borrowed() {
        borrowed = true;
        return true;
    }



}
