
package dispositivos;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Metodos {
    
    //creaedispositivo
     public void CrearDispositivo() {
       

    
        
         Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Elija un disporitivo");
           System.out.println("1. Computadora portatil           1");
           System.out.println("2. Tablet                         2");
           System.out.println("3. SmartWatch                     3");
           System.out.println("4. SmartPhone                     4");
           System.out.println("5. Auriculares Inalambricos       5");
           System.out.println("6. Salir");
           try{
            
           System.out.println("Seleccione tipo de dispositivo  crear");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                   CompuPortatil laptop = new CompuPortatil();
                   laptop.metodolaptop();
                      
                   break;
                  
                  
               case 2:
                  Tablet tab = new Tablet();
                  tab.metodotablet();
                 break;
                   
               case 3:    
                  SmartWatch reloj = new SmartWatch();
                  reloj.metodowatch();
                 break;  
                   
               case 4:    
                   SmartPhone celu = new SmartPhone();
                   celu.metodophone();
                 break;  
                 
                 
                   
               case 5:    
                  AuricularesInalambricos audi = new AuricularesInalambricos();
                  audi.metodoaudi();
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
     
     
       //administrar dispositivo
     public void AdministrarDispositivo() {
  
  
      System.out.println("Crear nuevo");
      System.out.println("Borrar dispositivo");
      System.out.println("Crear copia de seguridad");
  
   
}
     
     
     //acciones dispositivos
     public void AccionesDispositivos (){
   
         Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
         System.out.println("Menu");
   
       System.out.println("1. Tomar fotografias.       1");
       System.out.println("2. Copiar texto.            2");
       System.out.println("3. Pegar texto.             3");
       System.out.println("4. Llamadas telefonicas.    4");
       System.out.println("5. Mensajes.                5");
       System.out.println("6. Notificaciones.          6");
       System.out.println("7. Compartir documentos.    7");
       System.out.println("8. Conexion de auriculares. 8");
       System.out.println("9. Reproductor de musica    9");
       System.out.println("10.Salir                   10");
       try{
            
           System.out.println("Seleccione una opcion");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
         
                   Metodos fotografias = new Metodos();
                   fotografias.fotografias();
                      
                   break;
                  
                  
               case 2:
                  Metodos copiartext = new Metodos();
                  copiartext.copiartext();
                 break;
                   
               case 3:    
                  Metodos pegartext = new Metodos();
                  pegartext.pegartext();
                 break;  
                   
               case 4:    
                   Metodos llamadas = new Metodos();
                   llamadas.llamadas();
                 break;  
                 
                 
                   
               case 5:    
                  Metodos mensajes = new Metodos();
                  mensajes.mensajes();
                 break;
                   
                   
               case 6:
                   Metodos notificaciones = new Metodos();
                   notificaciones.notificaciones();
                   break;
                   
                   
               case 7:
                  Metodos comdoc = new Metodos();
                  comdoc.comdoc();
                   
                   break;
                   
                   
               case 8:
                   Metodos conau = new Metodos();
                   conau.conau();
                   break;
                   
                   
               case 9:
                   Metodos media = new Metodos();
                   media.media();
                   
               case 10:    
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 9");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes insertar un numero");
               teclado.next();
                   
           }
            
       }
       
       
}
     
        //cargas masivas
     public void CargasMasivas (){
  
  
      System.out.println("No existen datos");
    
}
     
    //logs
    public void logsn() {

        String correo;
        String nombre;
        String estado;

    }
    private String correo;

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String estado;

    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Set the value of estado
     *
     * @param estado new value of estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    public Metodos() {

    }
    
    
     // compu portatil
     public class CompuPortatil {
  public void metodolaptop (){
  
           Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Para configurar ingrese los siguientes datos");
           System.out.println("1. Correo electronico          1");
           System.out.println("2. Nombre del dispositivo      2");
           System.out.println("3. Mantener visibilidad activa 3");
           System.out.println("4. Mantener encendido          4");
           System.out.println("5. Salir                       5");
           
           try{
            
           System.out.println("Seleccione configuracion a editar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                    Metodos mail = new Metodos();
                   mail.Mail();
                      
                   break;
                  
                  
               case 2:
                  Metodos NombreDispositivo  = new Metodos();
                  NombreDispositivo.NombreDispositivo();
                 break;
                   
               case 3:    
                Metodos VisibilidadActiva  = new Metodos();
                 VisibilidadActiva.VisibilidadActiva();
                 break;  
                   
               case 4:    
                   Metodos On = new Metodos();
                   On.On();
                 break;  
                 
                   
                   
              
               case 5:
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
    
    
}
     
     
     //smartphone
     public class SmartPhone {
 
    
    public void metodophone(){
    
        Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Para configurar ingrese los siguientes datos");
           System.out.println("1. Correo electronico          1");
           System.out.println("2. Nombre del dispositivo      2");
           System.out.println("3. Mantener visibilidad activa 3");
           System.out.println("4. Mantener encendido          4");
           System.out.println("5. Salir                       5");
           
           try{
            
           System.out.println("Seleccione configuracion a editar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                    Metodos mail = new Metodos();
                   mail.Mail();
                      
                   break;
                  
                  
               case 2:
                  Metodos NombreDispositivo  = new Metodos();
                  NombreDispositivo.NombreDispositivo();
                 break;
                   
               case 3:    
                 Metodos VisibilidadActiva  = new Metodos();
                 VisibilidadActiva.VisibilidadActiva();
                 break;  
                   
               case 4:    
                   Metodos On = new Metodos();
                   On.On();
                 break;  
               
               case 5:
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
}

     
     //smartwatch
     
     public class SmartWatch {
    
    public void metodowatch (){
    
        Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Para configurar ingrese los siguientes datos");
           System.out.println("1. Correo electronico          1");
           System.out.println("2. Nombre del dispositivo      2");
           System.out.println("3. Mantener visibilidad activa 3");
           System.out.println("4. Mantener encendido          4");
           System.out.println("5. Salir                       5");
           
           try{
            
           System.out.println("Seleccione configuracion a editar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                   Metodos mail = new Metodos();
                   mail.Mail();
                      
                   break;
                  
                  
               case 2:
                  Metodos NombreDispositivo  = new Metodos();
                  NombreDispositivo.NombreDispositivo();
                 break;
                   
               case 3:    
                 Metodos VisibilidadActiva  = new Metodos();
                 VisibilidadActiva.VisibilidadActiva();
                 break;  
                   
               case 4:    
                   Metodos On = new Metodos();
                   On.On();
                 break;  
               
               case 5:
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
    
}

     
     //tablet
     
     public class Tablet {
  
    public void metodotablet(){
    
        Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Para configurar ingrese los siguientes datos");
           System.out.println("1. Correo electronico          1");
           System.out.println("2. Nombre del dispositivo      2");
           System.out.println("3. Mantener visibilidad activa 3");
           System.out.println("4. Mantener encendido          4");
           System.out.println("5. Salir                       5");
           
           try{
            
           System.out.println("Seleccione configuracion a editar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                  Metodos mail = new Metodos();
                   mail.Mail();
                      
                   break;
                  
                  
               case 2:
                  Metodos NombreDispositivo  = new Metodos();
                  NombreDispositivo.NombreDispositivo();
                 break;
                   
               case 3:    
                Metodos VisibilidadActiva  = new Metodos();
                 VisibilidadActiva.VisibilidadActiva();
                 break;  
                   
               case 4:    
                  Metodos On = new Metodos();
                   On.On();
                 break;  
            
               case 5:
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
}

     
     //audifonos
     
     public class AuricularesInalambricos {
    
    
   public void metodoaudi (){
   
      Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
           System.out.println("Para configurar ingrese los siguientes datos");
           System.out.println("1. Correo electronico          1");
           System.out.println("2. Nombre del dispositivo      2");
           System.out.println("3. Mantener visibilidad activa 3");
           System.out.println("4. Mantener encendido          4");
           System.out.println("5. Salir                       5");
           
           try{
            
           System.out.println("Seleccione configuracion a editar");
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   
                   
                   Metodos mail = new Metodos();
                   mail.Mail();
                      
                   break;
                  
                  
               case 2:
                  Metodos NombreDispositivo  = new Metodos();
                  NombreDispositivo.NombreDispositivo();
                 break;
                   
               case 3:    
                 Metodos VisibilidadActiva  = new Metodos();
                 VisibilidadActiva.VisibilidadActiva();
                 break;  
                   
               case 4:    
                   Metodos On = new Metodos();
                   On.On();
                 break;  
                 
               case 5:
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
}
     
     //mail
     
     public void Mail() {
    
    
       Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        String mail=null ;
       while(!salir){
           System.out.println("Ingresar datos");
           System.out.println("1. Ingrese correo electronico          1");
           System.out.println("2. Salir                               2");
           try{
            
          
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   System.out.println("ingrese sus datos"); 
               mail = teclado.next();
                
                
                    System.out.println("su correo es: "+mail);
                      
                   break;
                  
             
               case 2:
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 2");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes ingresar tu cuenta");
               teclado.next();
                   
           }
            
       }
    
    
    
    
    
}
     
     //Nombre dispositivo
     
     public void NombreDispositivo () {
    
    
    
       Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        String Name=null ;
       while(!salir){
           System.out.println("Ingresar Nombre de dispositivo");
           System.out.println("1. Ingrese Nombre          1");
           System.out.println("2. Salir                   2");
           try{
            
         
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   System.out.println("ingrese el nombre deseado"); 
               Name = teclado.next();
                
                
                    System.out.println("El nombre del dispositivo es: "+Name);
                      
                   break;
                  
             
               case 2:
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 2");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes un nombre");
               teclado.next();
                   
           }
            
       }
    
    
    
    
    
    
}
     
     //Visibilidad
     public void VisibilidadActiva() {
  
   
         Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        int Visible=1 ;
       while(!salir){
           System.out.println("Elegir Visibilidad Activa");
           System.out.println("1. Presione 1 para activar        1");
           System.out.println("2. Salir                          2");
           try{
            
           
           opcion = teclado.nextInt();
           
       
           
               switch (opcion){
                       
                       
                      // este es el menu
                       
               case 1:
                   
          
          
                   System.out.println("Presione el numero 1"); 
               Visible = teclado.nextInt();
               
               if(Visible == 1){
                
                
                    System.out.println("Visibilidad activada ");}
                      
                   break;
                  
             
               case 2:
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 2");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes activar la visibilidad");
               teclado.next();
                   
           }
            
       }
    
    
    
    
   
    
    
}
     
     //ON
     public void On () {
    
  
    
        Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion; 
        int ON=1 ;
       while(!salir){
           System.out.println("Elegir siempre encendido");
           System.out.println("1. Presione 1 para mantener siempre encendido        1");
           System.out.println("2. Salir                                             2");
           try{
      
           opcion = teclado.nextInt();
        
               switch (opcion){
              
               case 1:
                   ON = teclado.nextInt();
               
               if(ON == 1){System.out.println("Actualmente encendido ");}
                      
                   break;
                   case 2:
                   salir = true;
                   break;
                   
                   
                   
               default:
                   System.out.println("Solo números entre 1 y 2");
           
            }
                   
           }catch (InputMismatchException e){
               System.out.println("Debes mantener encendido");
               teclado.next();
                   
           }
            
       }
    
    
    
    
   
    
    
    
}

//Logear
     
     public Logger logger;
     FileHandler fh;
     
     public Metodos(String file_name)throws SecurityException, IOException{
     
         File f = new File(file_name);
         if(!f.exists())
         {
           f.createNewFile();
         }
         fh = new FileHandler(file_name, true);
         logger = Logger.getLogger("test");
         logger.addHandler(fh);
         SimpleFormatter formatter = new SimpleFormatter();
         fh.setFormatter(formatter);
     
     }
     
     
     //Fotografias
     
     public void fotografias(){
     
     
         System.out.println("Usted tomo una fotografia");
     
     }
     
     //copiar texto
     
     public void copiartext(){
     
     
         System.out.println("Texto copiado");
     }
     
     //pegar texto
     
     public void pegartext(){
     
         System.out.println("Texto pegado");
     }
     
     //llamadas
     
     public void llamadas(){
     
         System.out.println("llamando");
     
     
     
     }
     
     //mensajes
     
     public void mensajes(){
     
         System.out.println("Escriba un mensaje");
     
     
     }
     
     //Notificaciones 
     
     public void notificaciones (){
     
         System.out.println("Sin notificaciones");
     
     
     
     
     }
     
     //compartir documentos
     
     public void comdoc(){
     
         System.out.println("compartir documentos");
     
     
     
     }
     
     
     //conexion auriculares
     
     public void conau(){
     
         System.out.println("Seleccione auricularesa conectar");
     
     
     
     
     }
     
     // reproducir musica
     
     public void media(){
     
     
         System.out.println("Reproducioendo...");
     
     
     }
     
}

    
   

     
     
     
  

     
     
  
     
    

     