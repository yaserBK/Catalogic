package dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Book {
    private List<Author> authorList;
    private Date datePublished;
    private int pageCount;
    private Date dateOfPublication;
    private int estimatedWordCount;
    private int isban;
}
