class Dna_Array
{

String dna[]={"1110001101101","0001110101010","0001110101010","0001110101010","1110010101010","1111110101010","0001110101010"};

public static void main(String[] args)
{
Dna_Array ref= new Dna_Array();
ref.dna_rna();
}


public  void dna_rna()
{

array:for(int i=0;i<dna.length;i++)//outer for(array)

{
String concat="";

str1:for (int j=0;j<3;j++)//inner for(str1)

{
if (dna[i].charAt(j)=='0'||dna[i].charAt(j)=='1')
{
concat=concat+dna[i].charAt(j);
}
}//inner for(str1)

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
}//outer for(array)
}//dna_rna()

}//class block
