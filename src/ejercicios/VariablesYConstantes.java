package ejercicios;

public class VariablesYConstantes {
    static final int DIAS_SEMANA = 7;
    static final int DIAS_LABORALES = 5;
    //Tipos datos: Clasificación
    // Datos primitivos
    /*
    Numéricos entero: 
    ==================
    byte     -128 al 127
    short    -32.768 al 32.767
    int      -2.147.483.648 al 2.147.483.647
    long     -2^63 al 2^63
    ==================
    
    Numéricos decimales
    ===================
    float   -32.768^63 al 32.768^63
    double  -64.768^63 al 64.768^63
    ===================
    
    Lógicos (boolean)  true / false
    Caracteres (char)
    
    */
    // Datos no privitivos o Clases
    // Son todos aquellos que requieren de una libreria o una clase
    // para ser usado
    /*
    String
    Scanner
    */
    
    public static void main(String[] args){
        /* 
        Una variable es un espacio de memoria 
        que me permite almacenar un dato de un tipo de dato
        específico. 
        El dato puede cambiar, pero el tipo de datos no.
        Las variables deben ser declaradas en minúscula, y no deben contener
        caracteres latinos (á, é, í, ó , ú, ñ, ö)
        */
        byte edad; //Declaro una variable, llamada edad, de tipo entero byte
        short anho = 2020; 
        //Declaro una variable llamada anho, tipo entero short, y le asigno un valor
        anho = 1999;

        String nombre = "OlaKeAze";
        /*
        Una constante, tiene una tarea similar a la variable, con la única 
        diferencia que su valor no se modifica en el tiempo.
        Las constantes siempre se declara EN MAYUSCULA y antes de cualquier
        definición de datos (revisar la linea 4)
        */
        
    }
    
}
