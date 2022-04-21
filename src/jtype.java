import javax.swing.JOptionPane;

/**
 * Aplicación que realiza la misma tarea que el comando type 
 * de Windows (o cat en Unix).
 * 
 * @author josema
 * @version 1.1
 */
public class jtype {
	
    /**
     * jtype command
     *  
     * @param args Command-line arguments.
     * El primer argumento será un nombre de fichero
     */
	public static void main(String[] args) {
        String filename = null;
		// Examinar los argumentos de la linea de órdenes
		if (args.length>0) {
			if (!args[0].isBlank()) {
				filename = args[0];
				System.out.printf("Fichero: %s%n",args[0]);	
			}
		}
		else {
			filename = JOptionPane.showInputDialog("Nombre del Fichero");			
		}

		
	}

}
