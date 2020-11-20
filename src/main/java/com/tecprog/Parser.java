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

	public void setFile(String fileName) throws ArquivoNaoEncontradoException {
		File tmp = new File(System.getProperty("user.dir") + "/" + fileName);
		checkIfFileExists(tmp);
		this.file = tmp;
	}
	
	private void checkIfFileExists(File tmp) throws ArquivoNaoEncontradoException {
		if(!tmp.exists()) {
			throw new ArquivoNaoEncontradoException(tmp.getName());
		}
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