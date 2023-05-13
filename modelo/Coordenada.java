package modelo;

public class Coordenada 
{
    private double x;
    private double y;

    public Coordenada()
    {

    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // implemente un metodo adicional para la clase coordenada que permita calcular la distancia entre dos puntos en el plano.

    public double calcularDistancia(Coordenada c)
    {
        double distancia = Math.sqrt(Math.pow((this.x - c.x), 2) + Math.pow((this.y - c.y), 2));
        return distancia;
    }


    
    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    public boolean equals(Coordenada c)
    {
        if(this.x == c.x && this.y == c.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
}
