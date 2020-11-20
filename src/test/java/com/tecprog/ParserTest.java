package com.tecprog;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.tecprog.Parser;

/**
 * Unit test for simple App.
 */
public class ParserTest 
{
    private Parser p;

    @Test
    public void setFile1() throws ArquivoNaoEncontradoException {
      String fileName = "totalTime.out";
      p = new Parser();
      p.setFile(fileName);
      assertEquals(p.getFile().getName(), fileName);
    }

    @Test(expected = ArquivoNaoEncontradoException.class)
    public void setFile2() throws ArquivoNaoEncontradoException {
      p = new Parser();
      p.setFile("thisfiledoesnotexistsforsure.txt");
      assertNull(p.getFile());
    }

    @Test(expected = ArquivoNaoEncontradoException.class)
    public void setFile3() throws ArquivoNaoEncontradoException {
      p = new Parser();

      p.setFile("totalTime.out");
      assertEquals(p.getFile().getName(), "totalTime.out");
      
      p.setFile("analysisTime.out");
      assertEquals(p.getFile().getName(), "analysisTime.out");

      p.setFile("thisfiledoesnotexistsforsure.txt");
      assertNull(p.getFile());
    }
}
