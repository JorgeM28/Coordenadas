package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) 
    {
        // Sobreescriba los metodos toString e equals de la clase object, de tal forma que sea posible imprimir una coordenada en el formato estandar (x,y), asi como comparar dos coordenadas para verificar si son iguales o no. agregue el codigo necesario en el metodo main que permita probar estos dos metodos.

        Coordenada c1 = new Coordenada(1, 2);
        System.out.println(c1);

        Coordenada c2 = new Coordenada(1, 2);
        System.out.println(c2);

        if (c1.equals(c2)) 
        {
            System.out.println("Las coordenadas son iguales");
            System.out.println("La distancia entre los puntos es: " + c1.calcularDistancia(c2));
        } 
        else 
        {
            System.out.println("Las coordenadas son diferentes");
            System.out.println("La distancia entre los puntos es: " + c1.calcularDistancia(c2));
        }


    



        


    }
    
}
