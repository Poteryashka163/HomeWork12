public class Main {


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

        Author bookFio1 = new Author("Илья","Соломенный");
        Book book1 = new Book("Нейросити", 2022,bookFio1);
        System.out.println(bookFio1.getName()+" "+bookFio1.getSurname()+" "+book1.getTitle()+" "+book1.getYearPublication());

        Author bookFio2 = new Author("Артем","Кочеровский");
        Book book2 = new Book("Приемный", 2021,bookFio2);
        System.out.println(bookFio2.getName()+" "+bookFio2.getSurname()+" "+book2.getTitle()+" "+book2.getYearPublication());
        book2.setYearPublication(2022);
        System.out.println(book2.getYearPublication());

        Author bookFio3 = new Author("Павел","Корнев");
        Book book3 = new Book("Экзорцист", 2016,bookFio2);
        System.out.println(bookFio3.getName()+" "+bookFio3.getSurname()+" "+book3.getTitle()+" "+book3.getYearPublication());
        System.out.println("------------------------------------ ");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("------------------------------------ ");

        System.out.println(bookFio1.equals(book1));

        Author bookFio4 = new Author("Павел","Корнеев");
        Book book4 = new Book("Экзорцист", 2016,bookFio2);
        System.out.println(bookFio4.getName()+" "+bookFio4.getSurname()+" "+book4.getTitle()+" "+book4.getYearPublication());

        System.out.println(book3.equals(book4)+" "+bookFio3.equals(bookFio4));

        System.out.println("------------------------------------ ");


        boolean isHashcodeEquals = book3.hashCode() == book1.hashCode();

        if (isHashcodeEquals) {
            System.out.println("Следует сравнить методом equals.");
        } else {
            System.out.println("Не следует сравнивать методом equals, т.к. " +
                    "идентификатор отличается, что означает, что объекты точно не равны.");
        }


    }
}