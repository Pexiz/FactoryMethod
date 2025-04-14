package test;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {
    
    @Test
    public void test()
    {
        String nome = "pedro";
        Assert.assertEquals("pedro",nome);
    }
    
    @Test
    public void testNotEquals()
    {
        String nome = "pedro";
        Assert.assertNotSame("1",nome);
    }
    
}
