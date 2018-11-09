import static org.junit.Assert.*;

import org.junit.Test;

public class test_tp {

	@Test
	public void test() {
		int a = 5;
		int b = 8;
		assertTrue(essai.modu(b,a)==3);
		assertTrue(essai.modu(a, b)==1);
		assertTrue(essai.div(b, a)==1);
		assertTrue(essai.div(b, a)==2);
	}

}
