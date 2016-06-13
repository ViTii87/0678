
/**
 * Write a description of class VehiculosPorPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPorPlazas extends Vehiculo
{
    public int plazas;

    /**
     * Constructor for objects of class VehiculosPorPlazas
     */
    public VehiculoPorPlazas(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca,antiguedad, kilometraje);
        this.plazas = plazas;
    }

    public int getPlazas(){
        return plazas;
    }
}
