/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package CarreraCiclistica;
import java.util.*;
/**
 *
 * @author Oscar
 */
public class MetodosAbstractos {

   public static void main(String args[]) {
        System.out.println("Oscar David Pérez Quintero \n");
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas",320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal",25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
}

 class Equipo {
private String nombre; /* Atributo que define el nombre del equipo
de ciclismo */
private static double totalTiempo; /* Atributo que define el tiempo
total obtenido por el equipo */
private String país; /* Atributo que define el país al que pertenece el
equipo */
Vector listaCiclistas; // Atributo que define un vector de objetos ciclista
/**
* Constructor de la clase Equipo
* @param nombre Parámetro que define el nombre del equipo
* @param país Parámetro que define el país del equipo
*/
public Equipo(String nombre, String país) {
this.nombre = nombre;
this.país = país;
totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
listaCiclistas = new Vector(); /* Se crea el vector de ciclistas que
conforma el equipo */
}
public String getNombre() {
return nombre;
}
/**
* Método que establece el nombre de un equipo
* @param Parámetro que especifica el nombre de un equipo
*/
public void setNombre(String nombre) {
this.nombre = nombre;
}

private String getPaís() {
    return país;
}
private void setPaís(String país) {
    this.país = país;
}
void añadirCiclista(Ciclista ciclista) {
    listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
}

void listarEquipo() {
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        System.out.println(c.getNombre());
    }
}
void buscarCiclista() {
    Scanner sc = new Scanner(System.in); 
    String nombreCiclista = sc.next();
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        if (c.getNombre().equals(nombreCiclista)) { 
            System.out.println(c.getNombre());
            }
    }
}
void calcularTotalTiempo() {
    for (int i = 0; i < listaCiclistas.size(); i++) { 
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
    }
}
void imprimir() {
    System.out.println("Nombre del equipo = " + nombre);
    System.out.println("País = " + país);
    System.out.println("Total tiempo del equipo = " + totalTiempo);
   }
}

abstract class Ciclista {
private int identificador; /* Atributo que define el identificador de
un ciclista */
private String nombre; // Atributo que define el nombre del ciclista
private int tiempoAcumulado = 0; /* Atributo que define el tiempo
acumulado de un ciclista */
/**
* Constructor de la clase Ciclista
* @param identificador Parámetro que define el identificador de un
* ciclista
* @param nombre Parámetro que define el nombre completo de un
* ciclista
*/
public Ciclista(int identificador, String nombre) {
this.identificador = identificador;
this.nombre = nombre;
}
abstract String imprimirTipo();

protected int getIdentificador() {
    return identificador;
}
protected void setIdentificador() {
    this.identificador = identificador;
}
protected String getNombre() {
    return nombre;
}
protected void setNombre(String nombre) {
    this.nombre = nombre;
}
protected int getPosiciónGeneral(int posiciónGeneral) {
    return posiciónGeneral;
}
protected void setPosiciónGeneral(int posiciónGeneral) {
    posiciónGeneral = posiciónGeneral;
}
protected int getTiempoAcumulado() {
    return tiempoAcumulado;
}
protected void setTiempoAcumulado(int tiempoAcumulado) {
    this.tiempoAcumulado = tiempoAcumulado;
}
protected void imprimir() {
    System.out.println("Identificador = " + identificador);
    System.out.println("Nombre = " + nombre);
    System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}

class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    protected void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = "+ velocidadPromedio);
    }
    protected String imprimirTipo() {
        return "Es un velocista";
        }
    }

class Escalador extends Ciclista {
// Atributo que define la acelaración promedio de un escalador
    private double aceleraciónPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;
    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
}
    protected double getAceleraciónPromedio() {
        return aceleraciónPromedio;
    }
    protected void setAceleraciónPromedio(double
    aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }
    protected double getGradoRampa() {
        return gradoRampa;
    }
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " + aceleraciónPromedio);
    System.out.println("Grado de rampa = " + gradoRampa);
}

protected String imprimirTipo() {
    return "Es un escalador";
}
}

class Contrarrelojista extends Ciclista {
    private double velocidadMáxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + velocidadMáxima);
    }

    protected String imprimirTipo() {
        return "Es un constrarrelojista";
        }
   }