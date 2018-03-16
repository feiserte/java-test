package SpringWithMaven.webservices;

import org.junit.Assert;
import org.junit.Test;

import SpringWithMaven.webservices.HelloWebService;

public class HelloWebServiceTest {
    
	private HelloWebService ws = new HelloWebService();
	
	@Test
    public void testApp()
    {
		Assert.assertNotNull(ws.greeting("Felipe"));
    }
}
