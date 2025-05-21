package dto;

import jakarta.validation.Valid;
import lombok.Data;

import java.util.Date;

@Data
@Valid
public class UserBookEntry {
    private int rating;
    private Book book;
    private Date dateEntryCreated;
    private Date dateStarted;
    private Date dateFinished;
    private int activePageNumber;
    // Figure out if you want more detail on the edition;
    private UserInfo userInfo;
}

