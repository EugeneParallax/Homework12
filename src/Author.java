public class Author {
    private String name;
    private String surname;
    public Author( String name, String surname ){
        this.name = name;
        this.surname = surname;
    }

    // Getter for Author name:
    public String GetAuthorName(){
        return this.name;
    }
    public String GetAuthorSurname(){
        return this.surname;
    }
}
