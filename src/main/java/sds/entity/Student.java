package sds.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "student")
public class Student {

    @Id
    private ObjectId id;

    private String firstName;

    private String lastName;

    private String secondName;

    private String groupName;

    private Double avgGrade;

    @Field("created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    public String getId() {
        return id != null ? id.toHexString() : null;
    }

    public void setId(String id) {
        if (id != null) this.id = new ObjectId(id);
    }
}
