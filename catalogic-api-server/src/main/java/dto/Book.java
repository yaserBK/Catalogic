package dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.ISBN;

public class Book {
    private List<Author> authors;
    private Date datePublished;
    private int pageCount;
    private Date dateOfPublication;
    private int estimatedWordCount;
    private ISBN isbn;
}
