package chinchin.yajatime.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Board {
    @Id
    private Long boardId;
    private String name;

    @OneToMany
    @JoinColumn(name = "boardId")
    private List<Article> articles;
    
    private int nArticle;

}