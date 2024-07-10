package service;

import com.google.gson.Gson;
import model.ApiResponse;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConversorMoedas {
    private static final String API_KEY = "6167275ced1fb4a47d5009df"; // chave de API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public double converter(int opcao, double valor) {
        String fromCurrency, toCurrency;

        switch (opcao) {
            case 1:
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;
            case 2:
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;
            case 3:
                fromCurrency = "EUR";
                toCurrency = "BRL";
                break;
            case 4:
                fromCurrency = "BRL";
                toCurrency = "EUR";
                break;
            case 5:
                fromCurrency = "GBP";
                toCurrency = "BRL";
                break;
            case 6:
                fromCurrency = "BRL";
                toCurrency = "GBP";
                break;
            default:
                throw new IllegalArgumentException("Opção inválida");
        }

        return obterTaxaDeConversao(fromCurrency, toCurrency, valor);
    }

    private double obterTaxaDeConversao(String fromCurrency, String toCurrency, double valor) {
        try {
            String urlStr = API_URL + fromCurrency + "/" + toCurrency;
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Reader reader = new InputStreamReader(connection.getInputStream());
            Gson gson = new Gson();
            ApiResponse response = gson.fromJson(reader, ApiResponse.class);

            return valor * response.getConversionRate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
