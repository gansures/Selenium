import org.testng.annotations.Test;

public class Loops {
	//@Test
	public void loop1()
	{
		int n, m, k=6;
		for (n=1; n<=k;)
		{
		print(n);
		n++;
		if (n>k)
			for (n=k-1; n>=1;)
			{
			print(n);
			--n;
			if (n==0)System.exit(0);
		}
	}
	}
	
	public int print(int n)
	{
		for(int m=1; m<=n;)
		{
			System.out.print(m+" ");
			m++;
		}
		System.out.println();
		return n;
	}
	
	@Test
	public void alphaPrint()
	{
		
	}
	
}
