package br.com.caelum.ingresso.converter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

public class LocalTimeConverter implements Converter<String, LocalTime>{

	@Override
	public LocalTime convert(String text) {
		// TODO Auto-generated method stub
		return LocalTime.parse(text, DateTimeFormatter.ofPattern("HH:mm"));
	}
	

}
