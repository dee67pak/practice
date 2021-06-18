package First.Testing;

import org.testng.annotations.Test;

public class StringOperation {
	
	
	@Test
	public void revstring()
	{
	
		String s= "Deepak";
		
		int count= s.length();
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		
	}

}
