package dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Valid
@Data
@Builder
public class UserInfo {
    @Email
    private String email;
    private String firstName;
    private String lastName;
    private String userId;
    private Instant accountCreationDateTime;
}
