import java.io.IOException;
public class Calculadora{
   BuscaMoedas buscaMoedas = new BuscaMoedas();

    public Calculadora(double valor, String codigo1, String codigo2) throws IOException {

            Double calcula = valor * buscaMoedas.buscamoedas(codigo1, codigo2);
            System.out.println(String.format("Valor após conversão: %.2f %s", calcula, codigo2));
    }

}
