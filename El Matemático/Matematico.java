public class Matematico
{
 private double a;
 private double b;
 private double c;
 private double base;
 private double altura;

public Matematico(){
a = a ;
b = b ;
c = c ;
} 

String IdentificarNumeros(double a, double b, double c){
String resultado;
double mayor;
double medio;
double menor;
 if(a > b && b > c){
 mayor = a;
 medio = b;
 menor = c;
 }else if(a > c && c > b){
 mayor = a;
 medio = c;
 menor = b;
 }else if(b > a && a > c){
    mayor = b;
    medio = a;
    menor = c;
    }else if(b > c && c > a){
    mayor = b;
    medio = c;
    menor = a;
}else if(c > a && a > b){
    mayor = c;
    medio = a;
    menor = b;
}else{
    mayor = c;
    medio = b;
    menor = a;
}
 resultado = "el numero mayor es " + mayor + " el medio es " + medio + " y el menor es " + menor;
 return resultado;
}

double calcularArea(double base, double altura){
double Area;
Area = base * altura;
return Area;
}

double calculardistancia(Punto uno, Punto dos){
double formula;
formula = Math.sqrt((Math.pow(dos.getX() - uno.getX(), 2)) + (Math.pow(dos.getY() - uno.getY(), 2)));
return formula;

}

String HallarCuadrante(Punto uno){
 String cuadrante;
    if(uno.getX() < 0 && uno.getY() > 0){
      cuadrante = "Pertenece al Segundo Cuadrante";
  }else if(uno.getX() < 0 && uno.getY() < 0){
    cuadrante = "Pertenece al Tercer Cuadrante";
    }else if (uno.getX() > 0 && uno.getY() < 0){
    cuadrante = "Pertenece al Cuarto Cuadrante";
    }else{cuadrante = "Pertenece al Primer Cuadrante";}
 return cuadrante;
}


}
