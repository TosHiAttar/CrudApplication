package dcg.spring5.crud5.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestControllerAdvice
public class StudentControllerAdvice
{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public List<String> contrintvoilattion(MethodArgumentNotValidException e)
    {
        System.out.println("thsin is bookControllerAdvice");
        System.out.println("this in is contrintvoilation");





       List<String> list=new ArrayList();

       for (ObjectError exp : e.getBindingResult().getAllErrors())
        {

            list.add(exp.getDefaultMessage());
        }
        return list;
    }
}
