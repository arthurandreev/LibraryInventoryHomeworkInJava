import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity) {
            this.books.add(book);
        }
    }
}