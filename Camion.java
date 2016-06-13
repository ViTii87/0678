
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoPorPeso implements MedidasSeguridad
{
    /**
     * Constructor for objects of class Camion
     */
    public Camion(Marca marca, int antiguedad, int kilometraje, int peso)
    {
        super(marca, antiguedad, kilometraje, peso);
    }

    private boolean esArticulado(){
        return getMarca() == Marca.FORD || getMarca() == Marca.FIAT ? true : false;
    }
    
    public boolean cumpleMedidas(){
        return (esArticulado() && getPeso() < PESO_CAMIONES_ARTICULADOS) || (!esArticulado() && getPeso() < PESO_CAMIONES_NO_ARTICULADOS);
    }
}
