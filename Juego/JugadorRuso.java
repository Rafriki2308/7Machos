/**
 *
 * @author Martinez
 */
public class JugadorRuso {
    private int id;
    private String nombre;
    private boolean vivo;
    
    /**
     * Constructor que toma el id y cambia el valor vivo
     */
    public JugadorRuso(int id){
        this.id = id;
        vivo = true;
    }
    
    /**
     *Constructor que toma el nombre, y cambia el valor de vivo a true 
     */
    public JugadorRuso(String nombre){
        this.nombre = nombre;
        vivo = true;
    }
    
    /**
     *Constructor que toma el string y el numero de id y cambia el valor de vivo
     */
    public JugadorRuso(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        vivo = true;
    }

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo publico que toma un objeto tipo revolver y devuelve un boolean
     */
    public boolean seDispara(Revolver r){
        System.out.println("El jugador ruso con id= "+id+" y nombre= "+nombre
                +" es apuntado con el revolver.\n");
        /**
         *Esta estructura comprueba si el metdodo que de la clase revolver devuelve 
         * un true, significa que la bala estaba en el agujero del tambor, y el jugador 
         * muere, en caso contrario muestra un mensaje
         */
        if(r.disparar()){
            System.out.println("Esto se ha acabado.\n");
            vivo = false;
        } else {
            System.out.println("Esta ronda he tenido suerte\n");
        }
        return vivo;
    }
    
    public boolean isVivo(){
        return vivo;
    }
    
    
}
