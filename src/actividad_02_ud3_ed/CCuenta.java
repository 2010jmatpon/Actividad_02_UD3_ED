/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Juan María Mateos Ponce
 */
public class CCuenta {

    /**
     * @hidden nombre Es el nombre de la cuenta
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * @param CCuenta es el constructor por defecto
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Es la cuenta
    * @param sal Es el saldo de la cuenta
    * @param tipo Es el tipo de interés de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Asigna un nombre a la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return Devuelve el nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return devuelve el saldo de la cuenta
     */
    public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad Es la cantidad que se desea ingresar en la cuenta
     * @throws Exception Si la cantidad a ingresar es negativa devuelve un mensaje
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad Es la cantidad que se desea retirar de la cuenta
     * @throws Exception Exception Si la cantidad a ingresar es negativa o no hay saldo en la cuenta devuelve un mensaje
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @return Devuelve la cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     *
     * @param cuenta Es la cuenta
     */
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo es el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     *
     * @return nos devuelve el tipo de interés
     */
    public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés es el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
