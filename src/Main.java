public class Main {
    public static void main(String[] args) {

        Author robertSheckley = new Author("Robert", "Sheckley");
        Author frankHerbert = new Author("Frank", "Herbert");
        Author rafaelSabatini = new Author("Rafael", "Sabatini");

        Book sampleBook1 = new Book("Pyramid", robertSheckley, 1975);
        Book sampleBook2 = new Book("Dune", frankHerbert, 1965);
        Book sampleBook3 = new Book("Captain Blood", rafaelSabatini, 1992);

        int oldDate = sampleBook3.GetDate();
        sampleBook3.AdminSetDate(1922);
        System.out.println("Год издания изменен с " + oldDate + " на " + sampleBook3.date);

        // Testing custom toString() methods of Book + Author class.
        System.out.println(sampleBook1);
        System.out.println(sampleBook2);
        System.out.println(sampleBook3);

        // Testing custom .equals() methods
        Author author1 = new Author("Name","Surname");
        Author author2 = new Author("Name","Surname");
        Author author3 = new Author("Noname","Noname");
        System.out.println(author1.equals(author2));
        System.out.println(author2.equals(author1));
        System.out.println(author1.equals(author3));

        System.out.println(sampleBook1.equals(sampleBook2));
        Book cloneBook1 = new Book("Pyramid", robertSheckley, 1975);
        System.out.println(sampleBook1.equals(cloneBook1));

        // Testing redefined .hashCode() methods
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(sampleBook1.hashCode());
    }
}