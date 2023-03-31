package com.app.hk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PdfExport {
	
	private String pdfName;
	private String pdfExt;
	public String getPdfExt() {
		return pdfExt;
	}
	public void setPdfExt(String pdfExt) {
		this.pdfExt = pdfExt;
	}
	public String getPdfName() {
		return pdfName;
	}
	public void setPdfName(String pdfName) {
		this.pdfName = pdfName;
	}
	@Override
	public String toString() {
		return "PdfExport [pdfName=" + pdfName + ", pdfExt=" + pdfExt + "]";
	}
	public PdfExport() {
		super();
	}
	
	

}
