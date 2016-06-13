/**
 * Abstract class VehiculoPorPeso - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class VehiculoPorPeso extends Vehiculo
{
    public int peso;

    /**
     * Constructor for objects of class VehiculosPorPlazas
     */
    public VehiculoPorPeso(Marca marca, int antiguedad, int kilometraje, int peso)
    {
        super(marca,antiguedad, kilometraje);
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }
}
