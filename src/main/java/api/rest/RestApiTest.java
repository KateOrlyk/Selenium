package api.rest;

import api.weather.ExchangeObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;


public class RestApiTest {

    @Test
    public void TestRateEUR() throws JsonProcessingException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=EUR&json";
        String s = RestApiGet.getWeather(url);
        ExchangeObject myER = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println("Rate EUR: "+myER.rate);
    }
    @Test
    public void TestRateUSD() throws JsonProcessingException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&json";
        String s = RestApiGet.getWeather(url);
        ExchangeObject myER = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println("Rate USD: "+myER.rate);
    }
    @Test
    public void TestRateRUB() throws JsonProcessingException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=RUB&json";
        String s = RestApiGet.getWeather(url);
        ExchangeObject myER = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println("Rate RUB: "+myER.rate);
    }
}
