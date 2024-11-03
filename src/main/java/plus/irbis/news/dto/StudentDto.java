package plus.irbis.news.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String groupName;
    private Double avgGrade;
}
