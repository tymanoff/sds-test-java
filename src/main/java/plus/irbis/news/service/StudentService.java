package plus.irbis.news.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import plus.irbis.news.dto.StudentDto;
import plus.irbis.news.exception.CustomException;
import plus.irbis.news.mapper.StudentMapper;
import plus.irbis.news.repository.StudentRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentDto> getStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentMapper.MAPPER::convert)
                .toList();
    }

    public StudentDto createOrChangeStudent(Long id, StudentDto studentDto) {
        if (id == null) {
            throw new CustomException("Id is null");
        }

        if (!studentRepository.existsById(id)) {
            throw new CustomException("Student with id " + id + " not found");
        }
        studentDto.setId(id);
        return StudentMapper.MAPPER
                .convert(studentRepository.save(StudentMapper.MAPPER.convert(studentDto)));

    }

    public StudentDto createStudent(StudentDto studentDto) {
        return StudentMapper.MAPPER
                .convert(studentRepository.save(StudentMapper.MAPPER.convert(studentDto)));
    }


    public void deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new CustomException("Student with id " + id + " not found");
        }
    }
}
