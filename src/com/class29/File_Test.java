package com.class29;

public class File_Test {
	
	public static void main(String[] args) {
		File f = new JavaFile();
		f.open();
		f.close();
		f.edit();
	
		File f1 = new WordFile();
		f1.open();
		f1.close();
		f1.edit();
		
		File f2 = new PDFFile();
		f2.open();
		f2.close();
		f2.edit();
		
	}
}
