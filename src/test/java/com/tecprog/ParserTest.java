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
      p = new Parser();
      p.setFile("totalTime.out");
      assertNotNull(p.getFile());
    }

    @Test(expected = ArquivoNaoEncontradoException.class)
    public void setFile2() throws ArquivoNaoEncontradoException {
      p = new Parser();
      p.setFile("thisfiledoesnotexistsforsure.txt");
      assertNull(p.getFile());
    }
}
