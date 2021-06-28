/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

/**
 *
 * @author Yarad Yamil
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajes[] = {"primero","segundo","tercero"};
        try{
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error, tu apuntador se salio de rango");
        }
        System.out.println("##########################################");
        
        int a=99, b=0; //Cambiar los tipos(FLOAT INT ETC) para saber la exeption
        try{
           int c=a/b;
            System.out.println("C= " +c); 
        }catch(ArithmeticException ae){ //Catch cacha los errores de Exception para que no muera el programa
            System.out.println("Error, no puedes dividir entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta lo de finally");
            //Es un metodo sobrecargado pero con diferente parametro (ESTO CUANDO SE ANIDAN CATCH)
        }
        System.out.println("##########################################");
        
        try{
           int division = miMetodo(10,0);
            System.out.println("division =" + division); 
        }catch(ArithmeticException ae){
            System.out.println("Exepcion Aritmetica");
        }
        System.out.println("Mi programa sigue vivo");
    }
    
    public static int miMetodo(int a, int b) throws ArithmeticException{ //Indica a los programadores que
        if(b==0){                                                        //puede lanzar Exepciones (throws)
            throw new ArithmeticException();
        }
        return a/b;                                                     
    }
    
}
