/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    public static int id;
    private int idV;
    public static int numFord;
    public static int numFiat;
    public static int numOpel;
    public static int numCitroen;
    
    static{
        id = 0;
    }
    
    /**
     * Constructor
     */
    public Vehiculo(Marca marca, int antiguedad, int kilometraje){
        idV = id;
        id++;
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
        if(marca == Marca.FORD)
            numFord++;
            else if(marca == Marca.FIAT)
                numFiat++;
                else if(marca == Marca.OPEL)
                    numOpel++;
                    else if(marca == Marca.CITROEN)
                        numCitroen++;
    }
    
    public Marca getMarca(){
        return marca;
    }
    
    public int getID(){
        return idV;
    }

    public int getAnios(){
        return antiguedad;
    }
    
    public int getKM(){
        return kilometraje;
    }
}
