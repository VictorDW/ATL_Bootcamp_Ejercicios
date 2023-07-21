package com.bootcamp.SpringBootnewsletters.validators;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertFalse;


@SpringBootTest
public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido("dsfdsfdsf");
        Assertions.assertFalse(result);
    }

    @Test
    public void elEmailTieneQueTenerPunto() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido("viactur11@gmail");
        Assertions.assertFalse(result);
    }

    @Test
    public  void queElArrobaNoSeaLaUltimaLetraNiLaPrimera() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido("viactur.11@");
        boolean result2 = validator.isValido("@viactur.11");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result2);
    }

    @Test
    public  void queNoTengaEspacios() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido("vi actur.11@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public  void queNoTengaPuntosAntesyDepuesdelArroba() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido("viactur.@gmail.com");
        boolean result2 = validator.isValido("viactur@.gmail.com");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result2);
    }

    @Test
    public  void queNoInicieNiFinaliceConPuntos() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValido(".viactur@gmail.com");
        boolean result2 = validator.isValido("viactur@gmail.com.");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result2);
    }

    @Test
    public void SoloPermiteCaracteresAlfanumericos(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValido("viact&/ff@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void CantidadDeCaracteresPermitidosAntesDelArrobaEsDe6Y30Caracteres(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValido("fd@gmail.com");
        boolean result2 = emailValidator.isValido("asdasdasdasdasdasdaasdsdasdasdasd@gmail.com");
        Assertions.assertFalse(result);
        Assertions. assertFalse(result2);
    }

    @Test
    public void CantidadDeCaracteresPermitidoEntreArrobaYPuntoEsDe6Y10Caracteres(){
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValido("fasdasdasdd@g.com");
        boolean result2 = emailValidator.isValido("asdassdf@gasdasfsgdg.com");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result2);
    }

}
