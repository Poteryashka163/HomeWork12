public class Main {
    public static Book
    public static void main(String[] args) {
//        String authorName1 ="Илья ";
//        String authorSurname1 ="Соломенный";
//        String title1 ="Нейросити";
//        int year1 =2022;
//        String authorName2 ="Артем ";
//        String authorSurname2 ="Кочеровский";
//        String title2 ="Приемный";
//        int year2 =2021;
//        String authorName3 ="Павел ";
//        String authorSurname3 ="Корнев";
//        String title3 ="Экзорцист";
//        int year3 =2016;
//        System.out.println("____________________ ");


        Book book1 = new Book();
        Author bookFio1 = new Author();
        bookFio1.name = "Илья";
        bookFio1.surname = "Соломенный";
        book1.title="Нейросити";
        book1.yearPublication=2022;
        System.out.println(bookFio1.name+" "+bookFio1.surname+" "+book1.title+" "+book1.yearPublication);

    }
}