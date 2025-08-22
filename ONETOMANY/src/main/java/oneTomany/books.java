package oneTomany;

import javax.persistence.*;

@Entity
@Table(name = "Author_book")
public class books {
    @Id

    private int bookId;

    private String title;
    private String genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre(String pp) {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public books(int bookId, String title, String genre, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public books() {
    }
}
