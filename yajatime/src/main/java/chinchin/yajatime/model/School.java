package chinchin.yajatime.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class School {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int nStudent;
}