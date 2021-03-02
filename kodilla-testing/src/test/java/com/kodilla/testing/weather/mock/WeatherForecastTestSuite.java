package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
public Map generateData(){
    Map<String, Double> temperaturesMap = new HashMap<>();
    temperaturesMap.put("Rzeszow", 25.5);
    temperaturesMap.put("Krakow", 26.2);
    temperaturesMap.put("Wroclaw", 24.8);
    temperaturesMap.put("Warszawa", 25.2);
    temperaturesMap.put("Gdansk", 26.1);
    return temperaturesMap;

}

    @Mock
    private Temperatures temperaturesMock;



    @Test
    void testCalculateForecastWithMock() {
        //Given
        generateData();
        when(temperaturesMock.getTemperatures()).thenReturn(generateData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature() {
        //Given
        double result = 0.0;
        generateData();
        double sum = 25.5 + 26.2 + 24.8 + 25.2 + 26.1;

        result = sum / 5;
        when(temperaturesMock.getTemperatures()).thenReturn(generateData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(result, averageTemperature,4);
    }

    @Test
    void testCalculateMedianTemperatureEven() {
        //Given
        generateData();
        when(temperaturesMock.getTemperatures()).thenReturn(generateData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.56, result,4);
    }
    @Test
    void testCalculateMedianTemperatureOdds() {
        //Given
        generateData();
        when(temperaturesMock.getTemperatures()).thenReturn(generateData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, result,4);
    }
}