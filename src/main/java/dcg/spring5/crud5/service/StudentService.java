package dcg.spring5.crud5.service;

import dcg.spring5.crud5.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    void insertStudent(Student student);



}
