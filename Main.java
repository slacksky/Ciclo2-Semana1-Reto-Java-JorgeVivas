public class Main {
  static void method_c3po() {
    System.out.println("Ejercicio C3PO \n");
    System.out.println("   /~\\ ");
    System.out.println("  |oo ). ");
    System.out.println("  _\\=/_");
    System.out.println(" /  _  \\ ");
    System.out.println("//|/.\\|\\\\ ");
    System.out.println("\\\\ \\_/  || ");
    System.out.println(" \\|\\ /| || ");
    System.out.println(" # _ _/  #");
    System.out.println("  | | |");
    System.out.println("  | | |");
    System.out.println("  []|[]");
    System.out.println("  | | |");
    System.out.println("_/_]_[_\\___");

    System.out.println("/----cierre dibujar C3PO-----/ ");

  }

  static void method_pd(){
    String nombre="Jorge";
    String apellido="Vivas";
    String addr="Calle 75 # 45 - 13";
    String telef="3377456982";
    String barrio="chico";
    String ciudad="bogota";

    System.out.println("/----inicio datos personales-----/ \n");

    System.out.println("Mi nombre es: " + nombre);
    System.out.println("Mi apellido: " + apellido);
    System.out.println("La direccion: " + addr);
    System.out.println("Mi telefono: " + telef);
    System.out.println("El Barrio: " + barrio);
    System.out.println("La Ciudad: " + ciudad);

    System.out.println("\n/----cierre datos personales-----/ \n");

  }
  public static void main(String[] args) {

    method_c3po();//aqui invocamos el methodo para el poster de  C3PO
    method_pd();//aqui invocamoes el metodo que impirme datos personales
  }
}