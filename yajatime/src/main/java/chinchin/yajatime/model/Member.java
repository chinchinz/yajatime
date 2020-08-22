package chinchin.yajatime.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {
    @Id
    private String id;
    private String password;
    private String nickname;
    private String name;
    private String school;
    private int grade;
    private int sex;
    private List<Board> boards;
}