import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscaMoedas{
    public Double buscamoedas(String moeda, String moeda2) throws IOException {

        String apiKey = "API KEY";
        String endereco = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+moeda;


        URL url = new URL(endereco);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
        double valorDaMoeda = Double.valueOf(conversionRates.get(moeda2).getAsDouble());
        return valorDaMoeda;

    }


}
