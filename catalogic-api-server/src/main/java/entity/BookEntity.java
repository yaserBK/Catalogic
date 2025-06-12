package entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.ISBN;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "book_table")
public class BookEntity{
  //TODO: figure out how to represent relationships here
  //do I need to use a list in the entity or do I just specify using the oneToMany/ManyToMany annotations?
  private List<AuthorEntity> authors;
  private Date datePublished;
  private int estimatedWordCount;
  private ISBN isbn;
}
