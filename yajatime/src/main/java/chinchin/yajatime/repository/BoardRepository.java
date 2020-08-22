package chinchin.yajatime.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import chinchin.yajatime.model.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}