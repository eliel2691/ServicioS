
package serv;
import java.util.Scanner;

public class Implementa implements Solucion{
    public String convertir(String entrada) {
       String salida="",acum="",cont2="";
       
       int cont=0,inde=entrada.indexOf('o'),inde2=0,cont3=0;
         do{
         
            if(inde!=-1){
                 
                   acum="";
           for(int i=0;i<=cont;i++){
               acum=acum+"x";
           }
         
        
          salida=salida+entrada.substring(inde2,inde)+acum;
            inde=entrada.indexOf('o',inde+1);
           
            
                if(cont>=2){
                 inde2=salida.indexOf(acum); 
                 inde2=inde2-(cont);
                 inde2=inde2+2;
               //  cont3=cont3+3;
            }
       
                else{
                    inde2=salida.indexOf(acum)+1; 
                }
          
          cont++; 
           
            }
            else{
                cont2="Salir";
                salida=salida+entrada.substring(inde2-1);
                
            }
            if(cont==0){
                salida=entrada;
            }
         }while(cont2.equals(""));
              return salida;
    }
    public static void main(String args[]){
        Implementa in = new Implementa();
        Scanner entr = new Scanner(System.in);
        System.out.println("Ingrese el texto a convertir: " );
        String entrada=entr.nextLine();
        String salida=in.convertir(entrada);
        
        System.out.println(salida);
    }
    
}
