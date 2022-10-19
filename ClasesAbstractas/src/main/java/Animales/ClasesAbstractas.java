package Animales;

public class ClasesAbstractas {

public static void main(String[] args) {
    System.out.println("Oscar David Pérez Quintero \n");
    Animal[] animales = new Animal[4]; 
    animales[0] = new Gato();
    animales[1] = new Perro();
    animales[2] = new Lobo();
    animales[3] = new León();
    
    for (int i = 0; i < animales.length; i++) {
        System.out.println(animales[i].getNombreCientífico());
        System.out.println("Sonido: " + animales[i].getSonido());
        System.out.println("Alimentos: " + animales[i].getAlimentos());
        System.out.println("Hábitat: " + animales[i].getHábitat());
        System.out.println();
        }
    }
}

abstract class Animal {
    protected String sonido; 
    protected String alimentos; 
    protected String hábitat; 
    protected String nombreCientífico;
    public abstract String getNombreCientífico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();
}

abstract class Cánido extends Animal {}

class Perro extends Cánido {
    public String getSonido() {
        return "Ladrido";
}

public String getAlimentos() {
    return "Carnívoro";
}

public String getHábitat() {
    return "Doméstico";
   }

public String getNombreCientífico() {
    return "Canis lupus familiaris";
}
}

class Lobo extends Cánido {
    public String getSonido() {
        return "Aullido";
    }

public String getAlimentos() {
    return "Carnívoro";
    }

public String getHábitat() {
    return "Bosque";
    }

public String getNombreCientífico() {
    return "Canis lupus";
    }
}

abstract class Felino extends Animal {
}

class León extends Felino {

public String getSonido() {
    return "Rugido";
    }

public String getAlimentos() {
    return "Carnívoro";
}
public String getHábitat() {
    return "Praderas";
}

public String getNombreCientífico() {
    return "Panthera leo";
    }
}
class Gato extends Felino {
    public String getSonido() {
        return "Maullido";
        }

public String getAlimentos() {
    return "Ratones";
}
public String getHábitat() {
    return "Doméstico";
    }

public String getNombreCientífico() {
    return "Felis silvestris catus";
    }
}

