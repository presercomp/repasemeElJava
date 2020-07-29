package ejercicios;
public class EstructurasDeControl {
    public static void main(String[] args) {
        /**
         * Para usar las estructuras de control, es necesario conocer antes
         * los operadores matemáticos y comparativos.
         */
        /*
        Matemáticos:
        +   Suma
        -   Resta
        /   División
        *   Multiplicación
        %   Resto o Módulo
        ^   Potencia
        
        Comparativos (Java, C, C++, C#, Python, PHP):
        >   Mayor que
        >=  Mayor o igual que
        <   Menor que
        <=  Menor o igual que
        ==  Igual que
        !=  Distinto que   
        
        */
        
        /*
        IF : Nos permite ejecutar una serie de instrucciones
        Sólo si la condición evaluada es verdadera (true)
        */
        if(1 == 2){
            System.out.println("Increible, pero 1 es igual que 2");
        }
        /*
        IF - ELSE: Nos permite ejecutar una serie de insturcciones
        Si la condición evaluada es verdadera, y en caso de ser falsa
        ejecuta otro bloque de instrucciones
        */
        if(1 == 2) {
            System.out.println("Increible, pero 1 es igual que 2");
        } else {
            System.out.println("Las matemáticas siguen igual, 1 no es igual que 2");
        }
        
        /*
        IF - ELSE IF - ELSE: Igual al IF-ELSE con la diferencia que podemos
        evaluar una segunda condición o más, repetitivamente
        */
        if(1 > 2) {
            System.out.println("Increible, pero 1 es mayor que 2");
        } else if (2 > 3) {
            System.out.println("No puede ser, pero 2 es mayor que 3");
        } else {
            System.out.println("No se dio ninguna de las condiciones anteriores");
        }
        
    }
    
}
