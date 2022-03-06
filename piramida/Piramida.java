package piramida;

public class Piramida {
	
	private int n;
	
	public Piramida (int n)
	{
		this.n = n;
	}
	
	
	
	public void print()
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=n-i; j>=0; j--)
				System.out.print(" ");
			
			for(int j=1; j<=i*2; j++)
				System.out.print(n-i+1);
			
			System.out.print("\n");
					
		}
	}
	
	public static void main(String[] args) {
		
		Piramida p = new Piramida(5);
		p.print();
		
	}

}
