package sds.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sds.entity.Student;

public interface StudentRepository extends MongoRepository<Student, ObjectId> {
}
