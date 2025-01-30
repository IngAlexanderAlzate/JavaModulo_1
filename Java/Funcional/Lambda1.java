package Java.Funcional;

import java.util.function.BiFunction;

public class Lambda1 {
    public static void main(String[]args){
        // Usamos una Lambda para representar una función de suma
        BiFunction<Integer, Integer, Integer> suma =  (a, b) -> a + b;

        // Llamada a la función usando los parámetros directamente
        int resultado = suma.apply(5,3);
        System.out.println("Resultado: " + resultado);

    }
}