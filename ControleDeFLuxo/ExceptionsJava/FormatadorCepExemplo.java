package ControleDeFLuxo.ExceptionsJava;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23456791");
        }
        catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";

    }
}
