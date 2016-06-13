import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculo> listaVehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        listaVehiculos = new ArrayList<>();
    }

    /**
     * 
     */
    private void addVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    /**
     * 
     */
    private void removeVehiculo(int numVehiculo){
        int i = 0;
        boolean encontrado = false;
        while(i < listaVehiculos.size() && !encontrado){
            if(numVehiculo == listaVehiculos.get(i).getID())
                encontrado = true;
            listaVehiculos.remove(numVehiculo);
            i++;
        }

    }

    /**
     * 
     */
    private Marca marcaMayoritaria(){
        Marca marca = null;
        
        return marca;
    }

    /**
     * 
     */
    private boolean cumplenMedidas(){
        boolean todos = true;
        int i = 0;
        while(i < listaVehiculos.size() && todos){
            if(listaVehiculos.get(i) instanceof MedidasSeguridad){
                MedidasSeguridad ms = (MedidasSeguridad)listaVehiculos.get(i);
                if(!ms.cumpleMedidas())
                    todos = false;
            }
            i++;
        }
        return todos;
    }

    /**
     * 
     */
    private int[] getDatosVehiculo(int identificador){
        int[] datos = null;
        int i = 0;
        boolean encontrado = false;
        while(i < listaVehiculos.size() && !encontrado){
            if(identificador == listaVehiculos.get(i).getID())
                encontrado = true;
            else
                i++;
        }
        if(listaVehiculos.get(i) instanceof Coche){
            datos = new int[5];
            datos[4] = ((Coche)listaVehiculos.get(i)).aniosRevision();
        }
        else
            datos = new int[4];

        datos[0] = listaVehiculos.get(i).getID();
        datos[1] = listaVehiculos.get(i).getAnios();
        datos[2] = listaVehiculos.get(i).getKM();
        if(listaVehiculos.get(i) instanceof VehiculoPorPlazas)
            datos[3] = ((VehiculoPorPlazas)listaVehiculos.get(i)).getPlazas();
        return datos;
    }
}
