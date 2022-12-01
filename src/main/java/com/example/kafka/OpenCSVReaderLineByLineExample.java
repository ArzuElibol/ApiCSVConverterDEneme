package com.example.kafka;

// import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;



import org.springframework.stereotype.Service;

import com.example.kafka.model.WeatherNew;
// import com.fasterxml.jackson.databind.MappingIterator;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.SerializationFeature;
// import com.fasterxml.jackson.dataformat.csv.CsvMapper;
// import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class OpenCSVReaderLineByLineExample {


	// InputStream inputStream = CsvToJson.class.getClassLoader().getResourceAsStream("output.csv");
	// String csvAsString = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
	// String json = CDL.toJSONArray(csvAsString).toString();
	// try {
	// 	Files.write(Path.of("src/main/resources/output.json"), json.getBytes(StandardCharsets.UTF_8));
	// } catch (IOException e) {
	// 	e.printStackTrace();
	// }

	public List<?> WeatherReader() throws Exception
	{
		List<WeatherNew> beans = new CsvToBeanBuilder(new FileReader("C:\\Users\\SIBER2021\\Desktop\\kafkaCsvDeneme-master\\weatherHistory.csv"))
                .withType(WeatherNew.class)
                .build()
                .parse();
		beans.forEach(System.out::println);
		return beans;
	}



	// public MappingIterator<Weather> CsvReader() throws Exception {
	// 	// Weather weather = new Weather();
	// 	CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
	// 	CsvMapper csvMapper = new CsvMapper();
	// 	MappingIterator<Weather> orderLines = csvMapper.readerFor(Weather.class)
	// 			.with(orderLineSchema)
	// 			.readValues(new File("C:\\Users\\316975\\Desktop\\javaApp\\kafkaexample\\kafka\\weatherHistory.csv"));
	// 	new ObjectMapper()
	// 			.configure(SerializationFeature.INDENT_OUTPUT, true)
	// 			.writeValue(new File("C:\\Users\\316975\\Desktop\\javaApp\\kafkaexample\\kafka\\weatherHistory.json"), orderLines.readAll());

	// 	return orderLines;
	// }

}
