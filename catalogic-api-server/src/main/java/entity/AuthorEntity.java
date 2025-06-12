package entity;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;


@Entity(name="author_table")
@Getter
@Setter
public class AuthorEntity {

  private UUID id;
  private String name;

  @ManyToMany
  private BookEntity books;
}
