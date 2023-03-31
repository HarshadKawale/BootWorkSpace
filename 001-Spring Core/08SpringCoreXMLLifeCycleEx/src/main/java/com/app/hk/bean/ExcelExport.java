package com.app.hk.bean;

public class ExcelExport {

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
		System.out.println("Inside Constructor...");
	}
	
	public void setup() {
		
		System.out.println("Inside init method...");
	}
	
public void destroy() {
		
	System.out.println("Inside destroy method...");
	}
}
