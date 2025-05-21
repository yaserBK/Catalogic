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
    private String email; // TODO: check if there is a specific email type to use here instead of a string
    private String firstName;
    private String lastName;
    private String userId;
    private String address;// TODO: check if there is a specific address type to use here instead of a String
    private Instant accountCreationDateTime;
}
