package chinchin.yajatime.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import chinchin.yajatime.model.Board;

@DataJpaTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;
    
    @Test
    public void save(){
        Board board = new Board();
        board.setNArticle(0);
        board.setName("자유게시판");
        Board savedBoard = boardRepository.save(board);

        assertEquals("자유게시판", savedBoard.getName());
    }
}