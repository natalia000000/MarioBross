public abstract class Personaje {

    //Atributos
    protected String nombre;
    protected int vidas;
    protected int monedas;

    //Constructor
    public Personaje(String nombre, int vidas, int monedas){

        this.nombre = nombre;
        this.vidas = vidas;
        this.monedas = monedas;

    }

    public abstract void moverse();

    public int perderVida(){
        System.out.println("Nombre jugador: "+nombre);
        System.out.println("Vidas restantes: " + vidas);
        
    }

}