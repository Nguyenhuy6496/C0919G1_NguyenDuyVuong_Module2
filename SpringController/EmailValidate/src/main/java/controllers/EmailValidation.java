package controllers;

import models.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation {
    private static final String EMAIL_PATTERN = "^(\\w{1,20})(@[a-zA-Z0-9]{2,8})(.(\\w{2,4})){1,3}$";

    static boolean validate(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
