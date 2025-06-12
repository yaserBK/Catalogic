package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_table") 
public class UserEntity {
  private String email;
  private String firstName;
  private String lastName;
  private String accountCreationDate; 
}
