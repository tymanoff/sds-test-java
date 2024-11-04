package sds.dto;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
public class StudentDto {
    private String id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String groupName;
    private Double avgGrade;
}
