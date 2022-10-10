import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги - " + name + "Автор книги - "+ author + " Год публикации " + publicationYear;
    }

    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Book book = (Book) a;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}