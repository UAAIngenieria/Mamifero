package Mamiferos;

public class Mamifero{    
    private int patas;
    private String nombre;
    
    public void imprimirPatas(){
      System.out.println(" Tiene " + this.patas + " patas " + this.nombre);
    }

    public Mamifero(String nombre, int patas){
      this.nombre = nombre;
      this.patas = patas;
    }
    
    static class Perro extends Mamifero {
        public Perro(String nombre){
          super(nombre, 4);
        }
    }
      
    static class Gato extends Mamifero {
        public Gato(String nombre){
          super(nombre, 4);
        }

    }

    public static void main(String[] args) {
        Perro perrito = new Perro("Pantaleon");
        perrito.imprimirPatas();
        Gato gatito = new Gato("Michifus");
        gatito.imprimirPatas();
      }   

}