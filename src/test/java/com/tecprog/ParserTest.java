package com.tecprog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tecprog.Parser;

/**
 * Unit test for simple App.
 */
public class ParserTest 
{
    private Parser p;
    @Test
    public void setFile() {
      p = new Parser();
      p.setFile("example.txt");
      assertNotNull(p.getFile());
    }
}
