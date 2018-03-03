package dcg.spring5.crud5.constraint;

import dcg.spring5.crud5.model.Student;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class NameContainsValidator implements ConstraintValidator<NameContains, Student> {

    String substring;

    @Override
    public void initialize(NameContains constraintAnnotation) {
        this.substring = constraintAnnotation.substring();
    }



    @Override
    public boolean isValid(Student value, ConstraintValidatorContext context) {
        System.out.println("in validator : "+value.getSname().contains(substring));
        return value.getSname().contains(substring);
    }
}
