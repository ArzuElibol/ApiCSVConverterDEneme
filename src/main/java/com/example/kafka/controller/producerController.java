package com.example.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.OpenCSVReaderLineByLineExample;



@RestController
public class producerController {

    @Autowired
    private OpenCSVReaderLineByLineExample csvRead;

    @GetMapping("/csv")
    public ResponseEntity<List<?>> getCsv() throws Exception{
        OpenCSVReaderLineByLineExample csvRead2 = new OpenCSVReaderLineByLineExample();
        List<?> obj = csvRead2.WeatherReader();
        return new ResponseEntity<List<?>>(obj,HttpStatus.OK);
    }

//     @GetMapping("/csv2")
//     public ResponseEntity<Weather> getCsv1()throws Exception {
//       List<?> obj = (List<?>) csvRead.CsvReader();
// return new ResponseEntity<Weather> (HttpStatus.OK);

//     }
    
}
