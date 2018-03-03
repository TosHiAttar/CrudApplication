package dcg.spring5.crud5.controller;


import dcg.spring5.crud5.model.Student;
import dcg.spring5.crud5.service.StudentService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "student")
public class StudentController {

    @Setter
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudentList(){

        return studentService.getStudentList();
    }

    @PostMapping
    public void insertStudent(@RequestBody Student student){

        studentService.insertStudent(student);
    }

    @PutMapping
    public List<Student>updateStudent(@RequestParam Integer sno, @RequestBody Student student){


        student.setSno(sno);
        studentService.insertStudent(student);

        return studentService.getStudentList();
    }


}
