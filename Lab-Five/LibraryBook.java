class LibraryBook {
    String title;
    String author;
    int bookID;

    public LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Book Information ===\n");

        LibraryBook book1 = new LibraryBook("Java Programming", "Herbert Schildt", 101);
        LibraryBook book2 = new LibraryBook("Python for Beginners", "Eric Matthes", 102);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
