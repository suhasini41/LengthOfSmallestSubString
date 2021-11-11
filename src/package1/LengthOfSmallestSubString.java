package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthOfSmallestSubString
{

	private int lengthOfSmallestSubString(String s) {
		int n = 1;
		String sub = null;
		boolean flag = false;
		while(n<s.length())
		{
			for(int i=0;i<s.length();i++)
			{
				if(i+n<=s.length())
				{
					sub = s.substring(i,i+n);
					String rem1 = s.substring(i+1);
					String rem2 = s.substring(0,i+n-1);
					if((!rem1.contains(sub))&&(!rem2.contains(sub)))
					{
						System.out.println(sub);
						flag = true;
						break;
					}
				}
				if(flag==true)
				break;
			}
			if(flag==true)
				break;
			n++;
		}
		int l = sub.length();
		return l;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(lengthOfSmallestSubString("abaaba"), 2);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(lengthOfSmallestSubString("zyzyzyz"), 5);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(lengthOfSmallestSubString("aabbbabaaa"), 3);
	}

}
