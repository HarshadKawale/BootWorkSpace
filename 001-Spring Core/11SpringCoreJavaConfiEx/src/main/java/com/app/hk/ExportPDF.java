package com.app.hk;

import org.springframework.stereotype.Component;

@Component
public class ExportPDF {
	
	private String pdfName;
	private String authorName;
	
	public ExportPDF() {
		super();
	}
	
	public String getPdfName() {
		return pdfName;
	}
	public void setPdfName(String pdfName) {
		this.pdfName = pdfName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "ExportPDF [pdfName=" + pdfName + ", authorName=" + authorName + "]";
	}
	
	

}
