package AccoliteUniversity.MockitoPrime;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;

import junit.framework.Assert;

public class CheckServiceTest {
	
	CheckService chkObj;
	
	@Before
	public void setup() {
		IsPrime iObj= mock(IsPrime.class);
		when(iObj.check(15)).thenReturn(false);
		chkObj=new CheckService();
		chkObj.setObj(iObj);
		
	}
	@Test
	public void testCheckPrime() {
		Assert.assertEquals(true, chkObj.checkPrime(15));
	}

}
