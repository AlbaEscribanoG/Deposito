package cuentas;

/** author: Alba Escribano Gracia*/
public class CCuenta {

/** Atributos de la clase CCuenta*/
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

 /** Metodo GETTER para acceder al nombre del titular de la cuenta*/
    
    public String getNombre() {
		return nombre;
	}
 /** Metodo SETTER para modificar nombre del titular de la cuenta*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 /** Metodo GETTER para acceder al número de la cuenta*/
	public String getCuenta() {
		return cuenta;
	}
 /** Metodo SETTER para modificar número de la cuenta*/
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
 /** Metodo GETTER para acceder al saldo de la cuenta*/
	public double getSaldo() {
		return saldo;
	}
 /** Metodo SETTER para modificar saldo de la cuenta*/
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
 /** Metodo GETTER para acceder al tipo de interés de la cuenta*/
	public double getTipoInterés() {
		return tipoInterés;
	}
 /** Metodo SETTER para modificar tipo de interés de la cuenta*/
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
 /** Constructor por defecto de la clase CCuenta*/
	
	public CCuenta()
    {
    }

/**
 * Constructor para definir parámetros e inicializar valores de cuenta
 * @param nom - para el nombre del titular
 * @param cue - para nº de cuenta
 * @param sal - para saldo inicial
 * @param tipo - para tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * @return devuelve saldo actual que tiene la cuenta
 */
    public double estado()
    {
        return saldo;
    }
/**
 * Si se ingresa una cantidad negativa lanza excepción
 * @param cantidad - indicar cantidad a ingresar
 * @throws Exception - excepción que lanza si importe es mayor que 0
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Si se retira importe negativo o saldo es insuficiente, lanza excepción
 * @param cantidad - cantidad a retirar
 * @throws Exception - excepción que lanza
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
