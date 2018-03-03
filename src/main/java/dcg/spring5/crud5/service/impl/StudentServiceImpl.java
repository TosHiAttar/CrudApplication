package dcg.spring5.crud5.service.impl;

import dcg.spring5.crud5.model.Student;
import dcg.spring5.crud5.repository.StudentRepository;
import dcg.spring5.crud5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {




    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentList() {

        return studentRepository.findAll();
    }

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }


}
