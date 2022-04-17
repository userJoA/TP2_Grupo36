package ar.edu.unju.fi.punto7;

public class SecuenciaNumerica {
	public static void main(String args[])
    {
    	int i=2;
    	int j=40;
    	
        for(j=j;j>=0;j--)
        {
        		System.out.println(j*i);
        		i++;
         }
        System.out.println("Valor de j: " + j);
    }
}
