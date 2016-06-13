
/**
 * Write a description of interface MedidasSeguridad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface MedidasSeguridad
{
    static final int PLAZAS_PARA_COCHES = 5;
    static final int PLAZAS_PARA_FURGOS = 7;
    static final int PESO_CAMIONES_ARTICULADOS = 3000;
    static final int PESO_CAMIONES_NO_ARTICULADOS = 2000;
    
    boolean cumpleMedidas();
}
