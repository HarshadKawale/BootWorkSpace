package com.app.hk.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExport implements InitializingBean ,DisposableBean{
	
	private String fileName;
	private String fileExt;
	
	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public ExcelExport() {
		super();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("From destroy method....");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("From Init method....");
		
	}
	
	

}
