package plus.irbis.news.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import plus.irbis.news.dto.StudentDto;
import plus.irbis.news.entity.Student;

@Mapper
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    Student convert(StudentDto studentDto);

    StudentDto convert(Student student);
}
