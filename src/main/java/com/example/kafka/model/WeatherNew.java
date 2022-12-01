package com.example.kafka.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class WeatherNew {

    @CsvBindByPosition(position = 0)
    private String date;

    // private String day;

    @CsvBindByPosition(position = 1)
    @CsvBindByName(column="summary", required=true)
    private String summary;

    // @CsvBindByPosition(position = 2)
    // private double temperature;


    public WeatherNew(String date, String summary, double temperature) {
        this.date = date;
        this.summary = summary;
        // this.temperature = temperature;
        // this.day=this.date.split("\\s")[0];
    }
}
