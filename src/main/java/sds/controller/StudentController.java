package sds.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import sds.dto.StudentDto;
import sds.service.StudentService;

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
    public StudentDto changeStudent(@PathVariable String id, @RequestBody StudentDto studentDto) {
        log.info("Change student with id {}", id);
        return studentService.createOrChangeStudent(id, studentDto);
    }

    @PutMapping("/student/create")
    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
        log.info("Create student");
        return studentService.createStudent(studentDto);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        log.info("Delete student with id {}", id);
        studentService.deleteStudent(id);
    }
}
