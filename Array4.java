public class Array4 {
	public static void main(String[] args) {
		
		Integer array[][] = new Integer[50][100];
		
		for ( int contador1 = 49999; contador1 >= 0; contador1-- )	{
            for ( int contador2 = 49999; contador2 >= 0; contador2-- )	{
  			   array[contador1][contador2] = contador1 + contador2; 
	        }   
        }
		
		System.out.println("O valor da soma dos indices eh:" );
		
		for ( int contador1 = 49999; contador1 >= 0; contador1-- )	{
            for ( int contador2 = 49999; contador2 >= 0; contador2-- )	{
            	System.out.println(array[contador1][contador2]);
            }
		}
	}
}