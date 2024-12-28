package util;

public class Validacao {

    public static int modulo = 10;

    public static boolean cpfValido(String cpf) {
        if (modulo == 1) {
            return true;
        }
        return false;
    }

    public static boolean cpfInvalido(String cpf){
            // ..
            return true;

        }
}
