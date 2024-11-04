package sds.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sds.dto.StudentDto;
import sds.entity.Student;

@Mapper
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    Student convert(StudentDto studentDto);

    StudentDto convert(Student student);
}
