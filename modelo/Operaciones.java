package modelo;

public class Operaciones
{
    //Atributos
    protected double x;
    protected double y;
    protected double resultado;

    //Constructor
    public Operaciones(double x, double y)
    {
        this.x=x;
        this.y=y;
        this.resultado= 0;

    }

    //Metodos
    public double mostrarResultados()
    {
        return this.resultado;
    }
}