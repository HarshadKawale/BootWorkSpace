package com.app.hk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public ExportPDF expdfobj() {
		
		ExportPDF eobj = new ExportPDF();
		eobj.setPdfName("JavaBook");
		eobj.setAuthorName("Raghu Bellipalli");
		return eobj ;
		
		
		
	}

}
