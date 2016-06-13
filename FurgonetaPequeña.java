
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequeña extends VehiculoPorPlazas implements MedidasSeguridad
{

    /**
     * Constructor for objects of class FurgonetaPequeña
     */
    public FurgonetaPequeña(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje, plazas);
    }

    
    public boolean cumpleMedidas(){
        return getPlazas() < PLAZAS_PARA_FURGOS;
    }
}
