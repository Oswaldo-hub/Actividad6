import java.util.Scanner;

public class  Prom {
    public static void main(String[] args) {
        String nombre;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola registra el nombre del alumno");
        nombre = entrada.nextLine();

        float[] calificaciones = new float[5];
        System.out.println("Bienvenido al sistema");
        for(int i=0; i<5; i++){
         int c = i+1;
            System.out.println((i+1)+" Escribe la calificacion " + c );
            calificaciones[i] =entrada.nextFloat();

 calcular(calificaciones);
comparar(calificaciones,calcular(calificaciones));
imprmir(calificaciones,calcular(calificaciones),comparar(calificaciones,calcular(calificaciones)),nombre);
        }}




    private static float calcular(float calificaciones []) {
        float suma=0;
      for(int i=0; i< calificaciones.length;i++)
      {suma = suma + calificaciones[i];  }
      float pf = suma/5;

      return pf;
    }
    private static String comparar(float calificaciones [],float calcular) {
        String califinal="";
        if (calcular<=50) { califinal =" F ";}
        else if ((calcular>=51)&&(calcular<=60)) { califinal =" E "; }
        else if ((calcular>=61)&&(calcular<=70)) { califinal =" D "; }
        else if ((calcular>=71)&&(calcular<=80)) { califinal =" C ";}
        else if ((calcular>=81)&&(calcular<=90)) { califinal =" B ";}

        else if(calcular>=91){califinal =" A";}
       return  califinal; }
    private static void imprmir(float calificaciones [],float calcular, String comparar, String nombre) {
        for (float a:calificaciones ) {

            System.out.println("Hola, "+ nombre + " Tus calificaciones son: " + a);

        }
        System.out.println("Promedio: "+ calcular);
        System.out.println("Calificacion final: " + comparar);

    }

    }




