package chinchin.yajatime.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import chinchin.yajatime.model.Article;
import chinchin.yajatime.model.Board;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;
    
    @Test
    public void saveBoard() throws Exception{
        Board board = new Board();
        board.setNArticle(0);
        board.setName("자유게시판");
        Board savedBoard = boardRepository.save(board);

        assertEquals("자유게시판", savedBoard.getName());
    }

    public void saveArticle() throws Exception{
        Article article = new Article();
        article.setAuthor("jun");
        article.setContent("hihihihi");
        article.setCreatedAt(LocalDate.now());

        
    }
}