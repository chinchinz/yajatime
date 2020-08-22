package chinchin.yajatime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Certification {
    @Id
    private Long id;
    private String userId;
    private String school;
    private int grade;
    private Date subcribedAt;
    private Boolean isCertified;
    private String photoUrl;
}