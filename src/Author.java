import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getter for Author name:
    public String GetAuthorName() {
        return this.name;
    }

    public String GetAuthorSurname() {
        return this.surname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        String a2 = other.toString();
        return this.toString().equals(a2);
        }
    @Override
    public String toString(){
        return name + " " + surname;
    }
}