package plus.irbis.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plus.irbis.news.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
