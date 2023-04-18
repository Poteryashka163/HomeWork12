import java.util.Objects;

public class Book {
    final String title;
    private int yearPublication;
    final Author author;

    public Book(String title, int yearPublication, Author author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author=author;

    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle(){
        return this.title;
    }
    public int getYearPublication(){
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }
    public String toString(){
        return getTitle() +" "+getYearPublication()+" "+getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublication, author);
    }
}
