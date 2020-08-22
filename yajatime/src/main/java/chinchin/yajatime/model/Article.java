package chinchin.yajatime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Article {
    @Id
    private Long id;
    private Long boardId;
    private String title;
    private String content;
    private String author;
    private int view;
    private int like;
    private Date createdAt;
}