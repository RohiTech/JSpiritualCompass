package jspiritualcompass;

//librería para clases de entrada/salida
import java.io.*;

public class JLectorArchivo 
{
  //A T R I B U T O S
  /**
   * Objeto que tomará datos del objeto de entrada System.in
   */
  static public InputStreamReader isr;
  
  //atributo que almacenará el nombre del archivo...  
  static public String strNombreArchivo;
  
  //objeto que permitirá hacer la lectura de datos...
  static public BufferedReader input;

  static public String Linea = "";
  
  //M E T O D O S

  /**
   * Metodo Constructor
   *@param nuevoNombreArchivo Parámetro que contiene el nombre del archivo para abrir
   */
  public static void Leer_Archivo(String nuevoNombreArchivo) 
  {
  	//instanciación de objetos y apertura del archivo...
  	try
        {
            Linea = "";
            Principal.Limpiar_Texto();
            strNombreArchivo = nuevoNombreArchivo;
            isr = new InputStreamReader(new FileInputStream(strNombreArchivo));
            input = new BufferedReader(isr);
            leerYMostrarDatos();
  	}
        catch(Exception e) 
        {
            System.out.println("Error de lectura");
	}
  }

  /**
   *Lee datos del archivo y los muestra en pantalla
   */
  public static void leerYMostrarDatos()
  {
    //creación de variables para almacenar los datos leídos
    String strLineaLeida;
    
    //impresión en pantalla del nombre del archivo
    //System.out.println("Nombre del archivo: " + strNombreArchivo);
    //System.out.println("*************************************");

    //lea el archivo hasta que llegue al final
    //este valor booleano indicará si se puede o no continuar con la lectura
    boolean continuar = true;

    while(continuar)
    {
    	try 
        {
    		//lectura de una línea completa de texto
    		strLineaLeida = input.readLine();

        	//se leyó una línea de manera exitosa?
        	if(strLineaLeida==null)
                {
          		continuar = false;
        	}
                else
                {
          		//OK!!! se leyó una línea de texto
  		    	//impresión en pantalla de la línea leída
                        Linea += (strLineaLeida + "\n");
        	}
                Principal.Poner_Cita(Linea);
	}
	catch (EOFException eof) 
        {
		//FIN DE ARCHIVO ENCONTRADO, TERMINE EL CICLO
	    	continuar = false;
	}
	catch (IOException e) 
        {
		System.err.println( "Error durante la lectura del archivo");
		//termina el programa
		System.exit( 1 );
	}
    }

    //Ya se terminó de leer datos, por lo tanto el archivo se debe cerrar
    try 
    {
           input.close();
    }
    catch (IOException e) 
    {
	    System.err.println( "El archivo no se pudo cerrar correctamente" );
	    System.exit( 1 );
    }
  }
}