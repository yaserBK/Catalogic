/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
