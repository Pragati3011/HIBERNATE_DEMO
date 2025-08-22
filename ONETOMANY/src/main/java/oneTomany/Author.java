package oneTomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "A_Author")
public class Author {
    @Id
    private int authorId;

    private String name;
    private String nationality;

    @OneToMany(cascade = CascadeType.ALL)
    private List<books> booksList;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<books> booksList) {
        this.booksList = booksList;
    }

    public Author(int authorId, String name, String nationality, List<books> booksList) {
        this.authorId = authorId;
        this.name = name;
        this.nationality = nationality;
        this.booksList = booksList;
    }

    public Author() {
    }
}
