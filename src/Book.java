public class Book {
    String title;
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

}
