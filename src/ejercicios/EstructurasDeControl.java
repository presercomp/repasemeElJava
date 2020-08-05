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
        
        /*
        SWITCH
        El bloque switch permite evaluar varias condiciones
        por igualdad en una variable. 
        Se comporta como el IF - ELSE IF - ELSE pero más
        resumido
        */
        
        //Problema: Necesito mostrar el día de semana según el valor
        //numérico que le corresponda, asumiendo 1: lunes y 7:domingo
        int dia = 8; //este numero, corresponde al dia de la semana
        switch(dia){
            case 7:
                System.out.println("El dia es domingo");
            break;
            case 1:
                System.out.println("El dia es lunes");
            break;
            case 4:
                System.out.println("El dia es jueves");
            break;
            case 2:
                System.out.println("El dia es martes");
            break;
            case 3:
                System.out.println("El dia es miércoles");
            break;
            
            case 5:
                System.out.println("El dia es viernes");
            break;
            case 6:
                System.out.println("El dia es sabado");
            break;
            default:
                System.out.println("El numero está fuera de rango");
            break;
        }
        
        //Problema: Necesito mostrar un mensaje según calificaciones donde
        //éstas de declaran con letras de la 'a' a la 'e', siendo:
        //a: Excelente; b: Muy bueno, c: Bueno, d: Regular y e: Insuficiente
        char nota = 'a';
        switch(nota){
            case 'a':
               System.out.println("Obtuvo una nota Excelente"); 
            break;
            case 'e':
                System.out.println("Obtuvo una nota Insuficiente");
            break;
            case 'c':
                System.out.println("Obtuvo una nota Buena");
            break;
            case 'b':
                System.out.println("Obtuvo una nota Muy Buena");
            break;
            case 'd':
                System.out.println("Obtuvo una nota Regular");
            break;
        }
        
        /*
        Iteradores: Son estructura de control las cuales se van reptiendo un
        bloque de instrucciones de manera constante, mientras una condición 
        sea verdadera.
        */
        
        /*
        Iterador While: Ejecuta las instrucciones mientras la condicion sea
        verdadera. Necesitará de un cambio de variable para finalizar.
        Si la condición al inicio da falso, no se ejecuta nada
        */
        int contador = 10;
        while(contador < 10){           
            System.out.println("El contador va en " + contador);
            contador++;
        }
        
        /*
        Iterador Do-While: Ejecuta las instrucciones mientras la condicion sea
        verdadera. Necesitará de un cambio de variable para finalizar.
        Las instrucciones se ejecutan al menos una vez, independiente de que
        si la condicion es verdadera o no
        */
        int contadora = 0;
        do {
            System.out.println("La contadora tiene  " + contadora + " trabajos pendientes");
            contadora--;
        } while(contadora > 10);
        
        /*
        Iterador For: Ejecuta las instrucciones dentro de un rango de condiciones.
        Permite declara y modificar una varible internamente que servirá como puntero
        y que solo puede ser usada con números enteros:
        Primero, se declara la variable de tipo entero
        Segundo, se define el límite de la itereción (condicion)
        Tercero, se define el incremento o decremento de la variable.
        Cada seccion debe estar separada por un simbolo punto y coma (;)
        */
        
        for(int x = 0; x <= 10; x = x + 1){
           //x = 0
           //x = 2
           //x = 4
           //x = 6
           //x = 8
           //x = 10
        }
        
        
        
        
    }
    
}
