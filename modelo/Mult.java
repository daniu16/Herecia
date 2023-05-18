package modelo;


public class Mult extends Operaciones {
    
    public Mult(double x, double y)
    {
        super(x,y);
    }
    
    public void Mult()
    {
        resultado = x * y;
    }

    public double getResultado()
    {
        return resultado;
    }
}
