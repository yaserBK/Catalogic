package dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Valid
@Data
@Builder
public class User {
    private String email;
    private String firstName;
    private String lastName;
    private Instant accountCreationDateTime;
}
