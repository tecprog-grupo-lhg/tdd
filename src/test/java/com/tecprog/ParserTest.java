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
    public void setFile1() {
      p = new Parser();
      p.setFile("totalTime.out");
      assertNotNull(p.getFile());
    }

    @Test
    public void setFile2() {
      p = new Parser();
      p.setFile("thisfiledoesnotexistsforsure.txt");
      assertNull(p.getFile());
    }
}
