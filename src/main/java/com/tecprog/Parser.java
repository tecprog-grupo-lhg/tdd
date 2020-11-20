package com.tecprog;

import java.io.File;
import java.util.Scanner;
import java.nio.file.Path;

public class Parser {
	private File file;
	private char delimiter;
	private Path output;
	private String format;
	
	public File getFile() {
		return this.file;
	}

	public void setFile(String fileName) {
		File tmp = new File(fileName);

		if (checkIfFileExists(tmp) == true) {
			this.file = tmp;
		}
	}
	
	private Boolean checkIfFileExists(File f) {
		return f.exists();
	}

	public void setDelimiter(String delimiter) {
    // not implemented yet
	}
	
	public void setOutput(String output) {
    // not implemented yet
	}
	
	public void setFormat(String format) {
    // not implemented yet
  }
	
	public void parse() {
    // not implemented yet
  }
	
	public void save() {
    // not implemented yet
  }
	
	private void saveWithColumnFormat() {
    // not implemented yet
  }
	
	private void saveWithRowFormat() {
    // not implemented yet
  }
	
	private char transformDelimiterToChar(String delimiter) {
    // not implemented yet
    return 'a';
	}
}