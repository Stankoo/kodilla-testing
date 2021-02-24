package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        List<Double> results = new ArrayList<>();
        double average = 0.0;
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            results.add(temperature.getValue());
            for (int i = 0; i < results.size(); i++) {
                sum += results.get(i);
            }
        }
        return sum / results.size();
    }


    public double calculateMedianTemperature() {
        double median = 0.0;
        List<Double> results = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
        temperatures.getTemperatures().entrySet()) {
            results.add(temperature.getValue());}
            Collections.sort(results);
        return 0.0;
    }
}
