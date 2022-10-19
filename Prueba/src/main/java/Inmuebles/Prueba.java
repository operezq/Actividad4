package Inmuebles;
/**
* Esta clase prueba diferentes inmuebles, se calcula su precio de
* acuerdo al área y se muestran sus datos en pantalla
* @version 1.2/2020
*/
public class Prueba {
/**
* Método main que crea dos inmuebles, calcula su precio de
* acuerdo al área y se muestran sus datos en pantalla
*/
public static void main(String args[]) {
    System.out.println("Oscar David Pérez Quintero\n");
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
    System.out.println("Datos apartamento");
    apto1.calcularPrecioVenta(apto1.valorArea);
    apto1.imprimir();
    System.out.println("Datos apartamento");
    Apartaestudio aptestudio1 = new
    Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
    aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
    aptestudio1.imprimir();
}
}

class Inmueble {
    // Atributo para el identificador inmobiliario de un inmueble
    protected int identificadorInmobiliario;
    protected int área; // Atributo que identifica el área de un inmueble
    protected String dirección; /* Atributo que identifica la dirección de
    un inmueble */
    protected double precioVenta;
    Inmueble(int identificadorInmobiliario, int área, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.área = área;
        this.dirección = dirección;
    }
/**
* Método que a partir del valor del área de un inmueble, calcula su
* precio de venta
* @param valorArea El valor unitario por área de un determinado
* inmueble
* @return Precio de venta del inmueble
*/
double calcularPrecioVenta(double valorArea) {
    precioVenta = área * valorArea;
    return precioVenta;
    }
/**
* Método que muestra en pantalla los datos de un inmueble
*/
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area = " + área);
        System.out.println("Dirección = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}

class InmuebleVivienda extends Inmueble {
    protected int númeroHabitaciones;
/* Atributo que identifica el número de baños de un inmueble para
vivienda */
    protected int númeroBaños;
/**
* Constructor de la clase InmuebleVivienda
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un inmueble para la vivienda
* @param área Parámetro que define el área de un inmueble para la
* vivienda
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un inmueble para la vivienda
* @param númeroHabitaciones Parámetro que define el número de
* habitaciones que tiene un inmueble para la vivienda
* @param númeroBaños Parámetro que define el número de baños
* que tiene un inmueble para la vivienda
*/
public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
    super(identificadorInmobiliario, área, dirección); /* Invoca al
constructor de la clase padre */
    this.númeroHabitaciones = númeroHabitaciones;
    this.númeroBaños = númeroBaños;
}
/**
* Método que muestra en pantalla los datos de un inmueble para la
* vivienda
*/
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + númeroHabitaciones);
        System.out.println("Número de baños = " + númeroBaños);
        }
    }
class Casa extends InmuebleVivienda {
    protected int númeroPisos; /* Atributo que identica el número de
pisos que tiene una casa */
/**
* Constructor de la clase Casa
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de una casa
* @param área Parámetro que define el área de una casa
* @param dirección Parámetro que define la dirección donde se
* encuentra localizada una casa
* @param númeroHabitaciones Parámetro que define el número de
* habitaciones que tiene una casa
* @param númeroBaños Parámetro que define el número de baños
* que tiene una casa
* @param númeroPisos Parámetro que define el número de pisos
* que tiene una casa
*/
public Casa(int identificadorInmobiliario, int área, String dirección,int númeroHabitaciones, int númeroBaños, int númeroPisos) {
// Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección,
    númeroHabitaciones, númeroBaños);
    this.númeroPisos = númeroPisos;
}
/**
* Método que muestra en pantalla los datos de una casa
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Número de pisos = " + númeroPisos);
}
}

class Apartamento extends InmuebleVivienda {
/**
* Constructor de la clase Apartamento
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un apartamento
* @param área Parámetro que define el área de un apartamento
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un apartamento
* @param númeroHabitaciones Parámetro que define el número de
* habitaciones que tiene un apartamento
* @param númeroBaños Parámetro que define el número de baños
* que tiene un apartamento
*/
public Apartamento(int identificadorInmobiliario, int área, String
dirección, int númeroHabitaciones, int númeroBaños) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños);
}
/**
* Método que muestra en pantalla los datos de un apartamento
*/
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
}
}

 class CasaRural extends Casa {
// Atributo que identifica el valor por área para una casa rural
protected static double valorArea = 1500000;
/* Atributo que identifica la distancia a la que se encuentra la casa
rural de la cabecera municipal */
protected int distanciaCabera;
// Atributo que identifica la altitud a la que se encuentra una casa rural
protected int altitud;
public CasaRural(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos, int distanciaCabera, int altitud) {
// Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección,númeroHabitaciones, númeroBaños, númeroPisos);
    this.distanciaCabera = distanciaCabera;
    this.altitud = altitud;
}
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Distancia la cabecera municipal = " + númeroHabitaciones + " km.");
    System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
    System.out.println();
    }
 }

class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
// Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
}
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}

class ApartamentoFamiliar extends Apartamento {
// Atributo que identifica el valor por área de un apartamento familiar
protected static double valorArea = 2000000;
/* Atributo que identifica el valor de la administración de un
apartamento familiar */
protected int valorAdministración;
/**
* Constructor de la clase ApartamentoFamiliar
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un apartamento familiar
* @param área Parámetro que define el área de un apartamento familiar
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un apartamento familiar
* @param númeroHabitaciones Parámetro que define el número de
* habitaciones que tiene un apartamento familiar
* @param númeroBaños Parámetro que define el número de baños
* que tiene un apartamento familiar
* @param valorAdministración Parámetro que define el valor de la
* administración de un apartamento familiar
*/
public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministración) {
// Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
    this.valorAdministración = valorAdministración;
}
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Valor de la administración = $" + valorAdministración);
    System.out.println();
}
}

class Apartaestudio extends Apartamento {
// Atributo que identifica el valor por área de un apartaestudio
protected static double valorArea = 1500000;
/**
* Constructor de la clase Apartaestudio
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un apartaestudio
* @param área Parámetro que define el área de un apartaestudio
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un apartaestudio
* @param númeroHabitaciones Parámetro que define el número de
* habitaciones que tiene un apartaestudio
* @param númeroBaños Parámetro que define el número de baños
* que tiene un apartaestudio
*/
public Apartaestudio(int identificadorInmobiliario, int área, String
dirección,
int númeroHabitaciones, int númeroBaños) {
// Invoca al constructor de la clase padre
// Los apartaestudios tienen una sola habitación y un solo baño
super(identificadorInmobiliario, área, dirección, 1, 1);
}
/**
* Método que muestra en pantalla los datos de un apartaestudio
*/
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println();
}
}

class CasaConjuntoCerrado extends CasaUrbana {
// Atributo que define el valor por área de una casa en conjunto cerrado
protected static double valorArea = 2500000;
/* Atributo que define el valor de administración de una casa en
conjunto cerrado */
protected int valorAdministración;
// Atributo que define si una casa en conjunto cerrado tiene piscina
protected boolean tienePiscina;
/* Atributo que define si una casa en conjunto cerrado tiene campos
deportivos */
protected boolean tieneCamposDeportivos;
public CasaConjuntoCerrado(int identificadorInmobiliario, int área,
String dirección, int númeroHabitaciones, int númeroBaños,
int númeroPisos, int valorAdministración, boolean tienePiscina,
boolean tieneCamposDeportivos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños, númeroPisos);
this.valorAdministración = valorAdministración;
this.tienePiscina = tienePiscina;
this.tieneCamposDeportivos = tieneCamposDeportivos;
}
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + valorAdministración);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}

class CasaIndependiente extends CasaUrbana {
// Atributo que identifica el valor por área de una casa independiente
protected static double valorArea = 3000000;
public CasaIndependiente(int identificadorInmobiliario, int área,
String dirección, int númeroHabitaciones, int númeroBaños, int
númeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños, númeroPisos);
}
/**
* Método que muestra en pantalla los datos de una casa independiente
*/
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println();
}
}

class Local extends Inmueble {
    enum tipo {INTERNO,CALLE}; /* Tipo de inmueble especificado
como un valor enumerado */
    protected tipo tipoLocal; /* Atributo que identifica el tipo de
inmueble */
/**
* Constructor de la clase Local
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un local
* @param área Parámetro que define el área de un local
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un local
* @param tipoLocal Parámetro que define el tipo de local (interno o
* que da a la calle)
*/
public Local(int identificadorInmobiliario, int área, String dirección,
tipo tipoLocal) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección);
this.tipoLocal = tipoLocal;
}
/**
* Método que muestra en pantalla los datos de un local
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Tipo de local = " + tipoLocal);
    }
}

class LocalComercial extends Local {
    protected static double valorArea = 3000000;
/* Atributo que identifica el centro comercial donde está ubicado el
local comercial */
    protected String centroComercial;
/**
* Constructor de la clase LocalComercial
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de un local comercial
* @param área Parámetro que define el área de un local comercial
* @param dirección Parámetro que define la dirección donde se
* encuentra localizado un local comercial
* @param tipoLocal Parámetro que define el tipo de local comercial
* (interno o que da a la calle)
* @param centroComercial Parámetro que define el nombre del
* centro comercial donde está ubicado el local comercial
*/
public LocalComercial(int identificadorInmobiliario, int área, String
dirección, tipo tipoLocal, String centroComercial) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección, tipoLocal);
this.centroComercial = centroComercial;
}
/**
* Método que muestra en pantalla los datos de un local comercial
*/
void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}

class Oficina extends Local {
// Atributo que identifica el valor por área de una oficina
protected static double valorArea = 3500000;
// Atributo que identifica si una oficina pertenece o no al gobierno
protected boolean esGobierno;
/**
* Constructor de la clase Oficina
* @param identificadorInmobiliario Parámetro que define el
* identificador inmobiliario de una oficina
* @param área Parámetro que define el área de una oficina
* @param dirección Parámetro que define la dirección donde se
* encuentra localizada una oficina
* @param tipoLocal Parámetro que define el tipo de una oficina
* (interna o que da a la calle)
* @param esGobierno Parámetro que define un valor booleano para
* determinar si la oficina es del gobierno o no
*/
public Oficina(int identificadorInmobiliario, int área, String
dirección, tipo tipoLocal, boolean esGobierno) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección, tipoLocal);
this.esGobierno = esGobierno;
}
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}