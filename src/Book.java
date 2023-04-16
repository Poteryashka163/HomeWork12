import java.util.Objects;

public class Book {
    private String title;
    private int yearPublication;

    public Book(String title, int yearPublication, Author author) {
        this.title = title;
        this.yearPublication = yearPublication;

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
        return getTitle() +" "+getYearPublication();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublication);
    }
}
