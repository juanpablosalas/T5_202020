package view;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("0. Realizar la carga de los accidentes.");
			System.out.println("1. Requerimiento 1");
			System.out.println("2. Requerimiento 2");
			System.out.println("3. Requerimiento 3");
			System.out.println("4. Requerimiento 4");
			System.out.println("5. Requerimiento 5");
			System.out.println("6. Requerimiento 6");
			System.out.println("7. Requerimiento 7");
			System.out.println("8. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}
		


		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		

}
