package com.gowda;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AddressBookRegexValidationTest {

    public static AddressBookRegex validation;

    @BeforeAll
    public static void initialize(){
        validation = new AddressBookRegex();
    }
    @Test
    public void givenUserFirstName_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserFirstName_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserMiddleName_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserMiddleName_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserLastName_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserLastName_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserAddress_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserAddress_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserCityName_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserCityName_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserStateName_isValid_shouldReturnsTrue(){
        boolean result = validation.validateNames("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserStateName_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("abcde");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserZipCode_isValid_shouldReturnsTrue(){
        boolean result = validation.validateZipCode("400069");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserZipCode_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateZipCode("000469");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserPhoneNO_isValid_shouldReturnsTrue(){
        boolean result = validation.validatePhoneNo("+919768618289");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserPhoneNO_isInValid_shouldReturnsFalse(){
        boolean result = validation.validatePhoneNo("9768618289");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenUserEmail_isValid_shouldReturnsTrue(){
        boolean result = validation.validateEmail("ngowda335@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserEmail_isInValid_shouldReturnsFalse(){
        boolean result = validation.validateNames("76ngowda335@gmail.com");
        Assertions.assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc+100@gmail.com"})
    public void givenEmail_isValid_shouldReturnsTrue(String email){
        Assertions.assertTrue(validation.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"})
    public void givenEmail_isInValid_shouldReturnFalse(String email){
        Assertions.assertFalse(validation.validateEmail(email));
    }
}
