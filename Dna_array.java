Q:Write a program to create a string array and store given data?
class Dna_array 
{
	String dna[]={"1110001101101","0001110101010","0001110101010","0001110101010","1110101010010"};

	public static void main(String [] args)
	{
		Dna_array ref=new Dna_array();
		ref.dna_rna();
	}

	public void dna_rna()
	{
		array:for(int i=0;i<dna.length;i++)//outer for
		{
			String concat="";
			str1:for(int j=0;j<3;j++)//inner for
			{
				if(dna[i].charAt(j)=='0'||dna[i].charAt(j)=='1')
				concat=concat+dna[i].charAt(j);
			}
			if(concat.equals("000"))
			{
				System.out.println("Dna");
			}
			else if(concat.equals("111"))
			{
				System.out.println("Rna");
			}
			else
			{
				System.out.println("not valid info");
			}
		}
	}
}
