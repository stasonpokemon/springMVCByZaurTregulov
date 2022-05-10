package com.epam.trebnikau.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmailAnnotation, String> {

    private String endOfEmail;


    @Override
    public void initialize(CheckEmailAnnotation checkEmailAnnotation) {
        endOfEmail = checkEmailAnnotation.value();
    }

    @Override
    public boolean isValid(String enteredValue
            , ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
