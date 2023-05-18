package controlador;

import javax.swing.JOptionPane;

import modelo.Div;
import modelo.Div;
import modelo.Mult;
import modelo.Mult;
import modelo.Operaciones;
import modelo.Resta;
import modelo.Suma;

public class Controlador
{
    public static void main(String[] args) 
    {
        //Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));


        //Creacion de mi objeto Suma
        Suma miSuma = new Suma(x, y);
        miSuma.Sumar();
        JOptionPane.showMessageDialog(null, "La suma es: " + miSuma.getResultado());

        //Creacion de mi objeto Resta
        Resta miResta = new Resta(x, y);
        miResta.Resta();
        JOptionPane.showMessageDialog(null, "La resta es: " + miResta.getResultado());
        
        //Creacion de mi objeto Multiplicacion
        Mult miMultiplicacion = new Mult(x, y);
        miMultiplicacion.Mult();
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + miMultiplicacion.getResultado());

        //Creacion de mi objeto Division
        Div miDivision = new Div(x, y);
        miDivision.Div();
        JOptionPane.showMessageDialog(null, "La division es: " + miDivision.getResultado());
        
    }
}