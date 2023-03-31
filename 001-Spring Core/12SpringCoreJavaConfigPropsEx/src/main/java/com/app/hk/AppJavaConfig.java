package com.app.hk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:setup.properties")
public class AppJavaConfig {

	@Autowired
	public Environment env;

	@Bean
	public PdfExport pdfobj() {

		PdfExport obj = new PdfExport();
		obj.setPdfExt(env.getProperty("file.extension"));
		obj.setPdfName(env.getProperty("file.name"));

		return obj;
	}

}
