
package dispositivos;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Dispositivos {

    public static void main(String[] args) {
          try{
      Metodos my_log = new Metodos("log.txt");
      
      my_log.logger.setLevel(Level.WARNING);
          LogRecord record = null;
      String  variable; 
      System.out.println("Menu");
      my_log.logger.log(record);
      my_log.logger.warning("warning msg");
      my_log.logger.severe("Severe msg");
      
      
          
      
      
      
      } catch (Exception e){
      
      
      
      }
        
         List<Metodos> Dispositivos = new ArrayList<Metodos>();
        
        Dispositivos.add(new Metodos());
        Dispositivos.add(new Metodos());
        Dispositivos.add(new Metodos());
       
        ExportarCSV(Dispositivos);
        // TODO code application logic here
     
        Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
            while(!salir){
           System.out.println("Elija un disporitivo");
           System.out.println("1. Crear Dispositivo           1");
           System.out.println("2. Administrar dispositivo     2");
           System.out.println("3. Acciones con dispositivos   3");
           System.out.println("4. Cargas Masivas              4");
           System.out.println("5. Logs                        5");
           System.out.println("6. Salir");
           try{
            
           System.out.println("Seleccione opcion a ejecutar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   Metodos CrearDispositivo = new Metodos();
                   CrearDispositivo.CrearDispositivo();
                      
                   break;
                  
                  
               case 2:
                  Metodos AdministrarDispositivo  = new Metodos();
                   AdministrarDispositivo.AdministrarDispositivo();
                 break;
                   
               case 3:    
                   Metodos AccionesDispositivos = new Metodos();
                   AccionesDispositivos.AccionesDispositivos();
                 break;  
                   
               case 4:    
                   Metodos CargasMasivas  = new Metodos();
                   CargasMasivas.CargasMasivas();
                 break;  
                   
               case 5:    
                   Metodos logsn = new Metodos();
                   logsn.logsn();
                 break;
                   
                   
              
               case 6:
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 6");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes insertar un numero");
               teclado.next();
                   
           }
            
       }
            
     
    
     
            
        
     
        
       
            
            
            
            
}
    
      public static void ExportarCSV(List<Metodos> logs){
        String salidaArchivo = "logs.csv"; //Nombre del archivo
        boolean existe = new File(salidaArchivo).exists();//Verificar si existe
        
        //Si existe un archivo llamado asi lo borra
        if(existe){
            File archivoLogs = new File(salidaArchivo);
            archivoLogs.delete();
        }
        
        try {
            //Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
        
        
            
            // Datos datos para identificar las columnas
            salidaCSV.write("correo");
            salidaCSV.write("nombre");
            salidaCSV.write("estado");
            
            salidaCSV.endRecord(); //Deja de escribir en el archivo
            
            // recorremos la lista y lo insertamos en el archivo
            
            for(Metodos log : logs){
                salidaCSV.write(log.getCorreo());
                salidaCSV.write(log.getNombre());
                salidaCSV.write(log.getEstado());
                
                salidaCSV.endRecord(); //Dejamos de escrcibir en el archivo
            }
            
            salidaCSV.close();// cierra el archivo
        }catch (IOException e){
            e.printStackTrace();
        }
        
        }

    private static Metodos Metodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}