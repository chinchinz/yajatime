package chinchin.yajatime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Reply {
    @Id
    private Long id;
    private Long boardId;
    private Long articleId;
    private String author;
    private String content;
    private Date createdAt;
    private int like;
}