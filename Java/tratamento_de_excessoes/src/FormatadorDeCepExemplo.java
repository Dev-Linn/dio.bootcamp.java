public class FormatadorDeCepExemplo {


    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("3830720");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }



    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!= 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "38.307-260";

    }
}
