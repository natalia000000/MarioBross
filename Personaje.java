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
        vidas=5;
        vidas= 5-1;

        System.out.println("Vidas restantes:" + vidas);

        return vidas;
        
    }

    public final int recogerMoneda(){
        monedas=0;

        monedas=0+1;

        System.out.println("Cantidad de monedas es: " + monedas);

        return monedas;
    }

}