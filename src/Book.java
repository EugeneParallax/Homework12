public class Book {
    private String name;
    private Author author;
    int date;

    public Book( String name, Author author, int date){
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String GetName(){ // Getter for Book name:
        return this.name;
    }
    public Author GetAuthor(){ // Getter for Book author:
        return this.author;
    }
    public int GetDate(){ // Getter for Book publishing date:
        return this.date;
    }

    public void AdminSetDate(int newDate){
        this.date = newDate;
    }
}


