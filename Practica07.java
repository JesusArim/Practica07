/**
 *Clase Empleado 
 *@author Jesus Alberto Rivera Mora
 *@version 1.0
 */
public class Empleado{
    private String nombre;

    /**
     *Metodo constructor sin parametros de 
     *nombre de empleado
     *@param nombre Pancho
     */
    public Empleado(){
	this.nombre = Pancho;
    }
    /**
     *Metodo constructor con nombre de empleado
     *@param nombre Nombre de empleado
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }
    /**
     *Metodo que modifica el nombre de empleado
     *@param nombre Nuevo nombre de empleado
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /**
     *Metodo que regresa el nombre de empleado
     *@return Nombre de empleado
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     *Metodo que regresa una cadena 
     *@return cadena nombre de empleado
     *@override
     */
    public String toString(){
	return "Empleado:" + this.nombre;
    }
    /**
     *Metodo que verifica si dos empleados tienen el mismo nombre
     *@param nombre0 nombre a comparar
     *@return boolean true si son iguales y false si son diferentes
     */
    public boolean equals(Object nombre0){
	Nombre nombre = (Nombre)nombre0;
	if(nombre != nombre0){
	    return false;
	}
	return true;
    }
    
}

/**
 *Clase Operador que hereda atributos de clase Empleado
 *@author Jesus Alberto Rivera Mora
 *@version 1.0 
 */
public class Operador extends Empleado{
    private String nombre1;
    
    /**
     *Constructor de Operador
     *@param nombre
     *@param nombre1
     */
    public Operador(String nombre, String nombre1){
	super(nombre);
	this.nombre1 = nombre1;
    }
    /**
     *Metodo que modifica la cadena nombre1 de operador
     *@param nombre1 Nombre de operador
     */
    public void setNombre1(String nombre1){
	this.nombre1 = nombre1;
    }
    /**
     *Metodo que regresa la cadena nombre1 de operador
     *@return nombre1 Nuevo nombre de operador
     */
    public String getNombre1(){
	return this.nombre1;
    }
     /**
     *Metodo que obtiene la cadena con los nombres de empleado y operador
     *@return String cadena con los nombres de empelado y operador
     *@override
     */
    public String toString(){
	return super.toString() + "\t Operador:" + this.nombre1; 
    }
}

/**
 *Clase Directivo que hereda atributos de la clase empleado
 *@author Jesus Alberto Rivera Mora
 *@version 1.0
 */
public class Directivo extends Empleado{
    private String nombre2;

    /**
     *Constructor de Directivo
     *@param nombre
     *@param nombre2
     */
    public Directivo(String nombre, String nombre2){
	super(nombre);
	this.nombre2 = nombre2;
    }
    /**
     *Metodo que modifica la cadena nombre2 de directivo
     *@param nombre2 Nombre de directivo
     */
    public void setNombre2(String nombre2){
	this.nombre2 = nombre2;
    }
    /**
     *Metodo que regresa la cadena Nombre2 de directivo
     *@return nombre2 Nuevo nombre de directivo 
     */
    public String getNombre2(){
	return this.nombre2;
    }
    /**
     *Metodo que obtiene la cadena con nombre de Empleado y Directivo
     *@return cadena con los nombres de empleado y directivo
     *@override
     */
    public String toString(){
	return super.toString() + "\t Directivo:" + this.nombre2;
    }
}

/**
 *
 */
public class Oficial extends Operador{
    private String nombre3;

    /**
     *Constructor de Oficial
     *@param nombre1 Operador
     *@param nombre3 Oficial
     */
    public Oficial(String nombre1, String nombre3){
	super(nombre1);
	this.nombre3 = nombre3;
    }
    /**
     *Metodo que modifica la cadena nombre3 de Oficial
     *@param nombre3 
     */
    public void setNombre3(String nombre3){
	this.nombre3 = nombre3;
    }
    /**
     *Metodo que regresa la cadena del nombre de Oficial
     *@return nombre3 Nuevo nombre de Oficial
     */
    public String getNombre3(){
	return this.nombre3;
    }
    /**
     *Metodo para obtener una cadena con los nombres de operador y oficial
     *@return cadena con los nombres de operador y oficial
     *@override
     */
    public String toString(){
	return super.toString() + "\t Oficial:" + this.nombre3;
    }
    /**
     *Metodo que regresa un texto
     *@return Estoy trabajando
     */
    public static String trabaja(){
	return"Estoy trabajando";
    }
}
/**
 *Clase Tecnico que hereda atributos de la clase Operador
 *@author Jesus Alberto Rivera Mora
 *@version 1.0
 */
public class Tecnico extends Operador{
    private String nombre4;

    public Tecnico(String nombre1, String nombre4){
	super(nombre1);
	this.nombre4 = nombre4;
    }
    /**
     *Metodo que modifica la cadena nombre4 de Tecnico
     *@param nombre4
     */
    public void setNombre4(String nombre4){
	    this.nombre4 = nombre4;
	}
    /**
     *Metodo que regresa la cadena nombre4 de Tecnico
     *@return cadena con Nuevo nombre de Tecnico
     */   
    public String getNombre4(){
	return this.nombre4;
    }
    /**
     *Metodo que obtiene una cadena con nombre de Operador y Tecnico
     *@return cadena con nombre de Operador y tecnico
     *@override
     */
    public String toString(){
	return super.toString() + "\t Tecnico:" + this.nombre4;
    }
    /**
     *Metodo que regresa un texto
     *@return Estoy trabajando
     */
    public static String trabaja(){
	return"Estoy trabajando";
    }
    
}
