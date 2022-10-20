package com.gowda;

import java.util.regex.Pattern;

public class AddressBookRegex {

    public static Pattern nameRegex = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
    public static Pattern emailRegex = Pattern.compile("^(?=.{1,64})[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@*[^-][A-Za-z0-9-]+[^-][a-z]{2}[^-][a-z]{2,}$");
    public static Pattern phoneRegex = Pattern.compile("^(?:.{12})[0-9]$");
    public static Pattern zipRegex = Pattern.compile("^[1-9]{1}[0-9]{5}$");

}