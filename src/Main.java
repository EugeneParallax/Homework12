public class Main {
    public static void main(String[] args) {

        // Author name = new Author(name);
        Author robertSheckley = new Author("Robert", "Sheckley");
        Author frankHerbert = new Author("Frank", "Herbert");
        Author rafaelSabatini = new Author("Rafael", "Sabatini");

        // Book name = new Book(name, author, date);
        Book sampleBook1 = new Book("Pyramid", robertSheckley, 1975);
        Book sampleBook2 = new Book("Dune", frankHerbert, 1965);
        Book sampleBook3 = new Book("Captain Blood", rafaelSabatini, 1992);

        // Using date getter and setter to change Book date and print the change.
        int oldDate = sampleBook3.GetDate();
        sampleBook3.AdminSetDate(1922);
        System.out.println("Год издания изменен с " + oldDate + " на " + sampleBook3.date);

        System.out.println("Книга = " + sampleBook1.GetName());
        System.out.println("Автор = " + sampleBook1.GetAuthor().GetAuthorName() + " " + sampleBook1.GetAuthor().GetAuthorSurname());
        System.out.println("Издана = "+ sampleBook1.GetDate());
    }


}