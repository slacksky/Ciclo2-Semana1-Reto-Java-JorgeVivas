
import java.util.Scanner;

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

  static double  dist_cart(double[] A, double[] B){
    double dist=0;
    dist=Math.sqrt(Math.pow(A[0]-B[0],2)+Math.pow(A[1]-B[1],2));
    return dist;

  }
  static void method_cell(){
    //definiendo los 2  primeros puntos
    double[] cell={0,0},HQ={Math.random()*10,Math.random()*10} , ant1={Math.random()*10,Math.random()*10} , ant2={Math.random()*10,Math.random()*10};
    double dc1=0,dc2=0,d1H=0,d2H=0, dtotal=0, dcH=0;

    Scanner myObj = new Scanner(System.in);
    System.out.println("necesitamos las coordenadas del celular: x , y: " );
    cell[0] = myObj.nextDouble();
    cell[1] = myObj.nextDouble();

    /*System.out.println("Valor de A: "+ A );
    System.out.println("Valor de B: "+ B );*/
    dc1=dist_cart(cell,ant1);
    dc2=dist_cart(cell,ant2);
    d1H=dist_cart(ant1,HQ);
    d2H=dist_cart(ant2,HQ);
    dtotal=dc1+dc2+d1H+d2H;
    dcH=dist_cart(cell,HQ);

    System.out.println("dist del celular a la primera antena: "+ dc1 );
    System.out.println("dist de HQ a la primera antena: "+ d1H );
    System.out.println("dist de HQ a la segunda antena: "+ d2H );
    System.out.println("dist del celular a la segunda antena: "+ dc2 );
    System.out.println("dist total de conecion: "+ dtotal );
    System.out.println("dist de HQ al cell: "+ dcH );
  }


  public static void main(String[] args) {
    method_cell();
    //method_c3po();//aqui invocamos el metodo para el poster de  C3PO
    //method_pd();//aqui invocamos el metodo que imprime datos personales
  }
}