import java.util.ArrayList;

public class Library {


    ArrayList<Book> Library;
    ArrayList<Reader> Customer;


    public Library() {
        ArrayList<Book> Library = new ArrayList<>();
    }

    //adding books
    public void addBook(Book book) {
        Library.add(book);
    }

    //removing books
    public void removeBook(Book book) {
        Library.remove(book);
    }

    //list books
    public void ListBooks(Book book) {
        for (int i = 0; i < Library.size(); i++) {
            System.out.println(Library.get(i));
        }
    }

    //searching for the name to start the borrowing process
    public String searchTitle(String titleSearch) {
        if (titleSearch == null) {
            System.out.println("No books found in this library");
        }
        for (int i = 0; i < Library.size(); i++) {
            if (titleSearch.equalsIgnoreCase(Library.get(i).getTitle())) {
                return Library.get(i).toString();
            }
        }
        return "No books available";
    }

    public void borrowBook(String title) {
        int found = 0;
        for (Book book : Library) {
            if (book.getTitle().equals(title)) {
                if (found == 0) {
                    found = 1;
                }
                if (!book.borrowed()) {
                    book.borrowed = true;
                    found = 2;
                    break;
                }
            }
        }
        if (found == 0) {
            System.out.println("This book cannot be found in this Library");
        } else if (found == 1) {
            System.out.println("This book is already borrowed");
        } else if (found == 2) {
            System.out.println("You borrowed " + title);
        }
    }


    public Library(Reader reader) {
        ArrayList<Reader> Customer = new ArrayList<>();
    }

    public void addCustomer(Reader reader) {
        Customer.add(reader);
    }

    public void deleteCustomer(Reader reader) {
        Customer.remove(reader);
    }

    public void listCustomers(Reader reader) {
        for (int i = 0; i < Customer.size(); i++) {
            System.out.println(Customer.get(i));
        }
    }




}
