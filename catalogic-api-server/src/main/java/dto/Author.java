package dto;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Valid
public class Author { // Would be interesting if we could have specific
    // userTypes for Authors as long as they are verified.
    
    private String firstName;
    private String lastName;
    private List<Book> booksByAuthor;
}
