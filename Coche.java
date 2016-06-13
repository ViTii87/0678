
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPorPlazas implements MedidasSeguridad
{

    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje, plazas);
    }
    
    public int aniosRevision(){
        return getMarca() == Marca.FORD ? 2 : 1;
    }
    
    public boolean cumpleMedidas(){
        return getPlazas() < PLAZAS_PARA_COCHES;
    }
}
