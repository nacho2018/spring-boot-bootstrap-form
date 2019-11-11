package com.spring.bootstrap.form.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.bootstrap.form.app.models.Company;

@Configuration
public class AppConfiguration {

	@Bean
	public Company companyData() {
		
		List<String> locations = new ArrayList<String>();
		
		locations.add("England, UK");
		locations.add("Paris, France");
		locations.add("Madrid, Spain");
		locations.add("Bonn, Germany");
		
		return  new Company("Sand Diego Torrent A.S.", "1978", "Steward, Patrick", 12000L, locations);
		
	}
	@Bean
	@Primary
	public Company companyData2() {
		
		List<String> locations = new ArrayList<String>();
		
		locations.add("England, UK");
		locations.add("Paris, France");
		locations.add("Madrid, Spain");
		locations.add("Bonn, Germany");
		locations.add("Dubai, United Emirates");
		
		return  new Company("Sand Diego Torrent L.S.", "1978", "Dohe, John", 15000L, locations);
		
	}
}
