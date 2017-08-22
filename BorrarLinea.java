package estructura;
import javax.swing.*;
public class BorrarLinea 
{
	public static void main (String [] args)
	{
	    Pila pila = new Pila();
	    String frase = JOptionPane.showInputDialog(null,"ingresa una frase");
	    char caracter;
	    boolean flag = true;
	    int i;

	    for(i = 0; i < frase.length() && flag == true; i++)
	    {	
		    caracter = frase.charAt(i);
	    	if (caracter != '#' && caracter != '@')
		        pila.push(caracter);
		    if (caracter == '#')
			    pila.pop();
		    if (caracter == '@')
                while (pila.pilaVacia() == false)
                	pila.pop();
	    } 
	    pila.imprimir();
	}    
}
