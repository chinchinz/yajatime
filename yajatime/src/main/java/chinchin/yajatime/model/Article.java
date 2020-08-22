package chinchin.yajatime.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private Long boardId;
    private String title;
    private String content;
    private String author;
    private int view;
    private int like;
    private LocalDate createdAt;
}