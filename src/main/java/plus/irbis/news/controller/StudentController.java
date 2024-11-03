package plus.irbis.news.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import plus.irbis.news.dto.StudentDto;
import plus.irbis.news.service.StudentService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student/all")
    public List<StudentDto> getStudents() {
        log.info("Get all students");
        return studentService.getStudents();
    }

    @PostMapping("/student/change/{id}")
    public StudentDto changeStudent(@PathVariable Long id, @RequestBody StudentDto studentDto) {
        log.info("Change student with id {}", id);
        return studentService.createOrChangeStudent(id, studentDto);
    }

    @PutMapping("/student/create")
    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
        log.info("Create student");
        return studentService.createStudent(studentDto);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        log.info("Delete student with id {}", id);
        studentService.deleteStudent(id);
    }
}
