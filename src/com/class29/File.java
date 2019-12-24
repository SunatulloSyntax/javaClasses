package com.class29;

/*Create a class File that will have the following behaviors:
 *  open, edit, close. Edit and close are implemented method 
 *  while open is an abstract. Create 3 subclasses: 
 *  JavaFile, WordFile, PDFFile that will provide specific 
 *  implementation of open behaviour: Example: to open .java 
 *  file we need notepad++ or sublime text, to open .doc file
 *   we need Microsoft word to be installed etc*/
public abstract class File {

	
	abstract void open();
	
	void edit() {
		System.out.println("Edit");
	};
	
	void close() {
		System.out.println("Close");
	};
}
class JavaFile extends File{

	@Override
	void open() {
		System.out.println("Open JavaFile");
	}
	
}
class WordFile extends File{

	@Override
	void open() {
		System.out.println("Open WordFile");

		
	}
	
}
class PDFFile extends File{

	@Override
	void open() {
		System.out.println("Open PDFFile");

		
	}
	
}

