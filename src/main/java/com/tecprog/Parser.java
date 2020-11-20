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
		if (checkIfFileExists() == true) {
			this.file = new File(fileName);
		}
	}
	
	private Boolean checkIfFileExists() {
		return true;
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