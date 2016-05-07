    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author 2098654
 */
public class Equipo {
    
    // Atributos
    private String nombre;
    private String marca;
    private String accesorios;
    private int estado;
    private String descripcion;
    private Date fechaAdquisicion ;
    private Date fechaGarantia ;
    private int valor  ;
    private String ordenCompra;
    private int asegurado ;
    private String categoria;
    private int tiempoUso;
    private String proveedor;
    private String descripcionEstado;
    private List<Prestamo> prestamoEquipo;
    private String serial;
    private String foto;
    private int placa;
    private int codigoActivo;
    
    
    
    // Constructor
    /**
     * Equipo
     * @param nombre
     * @param marca
     * @param estado
     * @param descripcion
     * @param fechaAdquisicion
     * @param fechaGarantia
     * @param valor
     * @param ordenCompra
     * @param codigoActivo
     * @param asegurado
     * @param categoria
     * @param tiempoUso
     * @param proveedor
     * @param descripcionEstado 
     */
    public  Equipo (int placa, String nombre, String marca, int estado, String descripcion, Date fechaAdquisicion, Date fechaGarantia,int valor, String ordenCompra,int asegurado, String categoria, int tiempoUso, String proveedor, String descripcionEstado, String serial,String foto, List<Prestamo> prestamoEquipo, String accesorios){
        this.nombre=nombre;
        this.marca=marca;
        this.estado=estado;
        this.descripcion=descripcion;
        this.fechaAdquisicion=fechaAdquisicion;
        this.fechaGarantia=fechaGarantia;
        this.valor=valor;
        this.ordenCompra=ordenCompra;
        this.asegurado=asegurado;
        this.categoria=categoria;
        this.tiempoUso=tiempoUso;
        this.proveedor=proveedor;
        this.descripcionEstado=descripcionEstado;
        this.prestamoEquipo = prestamoEquipo;
        this.accesorios = accesorios;
    }
    
    // Metodos
    /**
     * 
     * @param serial
     * @param placa 
     */
    public Equipo(int placa, String serial){
        this.placa = placa;
        this.serial = serial;
    }
    
    /**
     * Constructor para mybatis
     */
    public Equipo(){
         
     }
    
    /**
     * 
     * @param serial 
     */
    public Equipo(String serial){
        this.serial=serial;
    }
    
    /**
     * 
     * @return 
     */
    public List<Prestamo> getEquipoPrestamo(){
        return prestamoEquipo;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * 
     * @return 
     */
    public int getEstado() {
        return estado;
    }
    
    /**
     * 
     * @param estado 
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    /**
     * 
     * @return 
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * 
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * 
     * @return 
     */
    public Date getFecha_adquisicion() {
        return fechaAdquisicion;
    }
    
    /**
     * 
     * @param fecha_adquisicion 
     */
    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fechaAdquisicion = fecha_adquisicion;
    }
    
    /**
     * 
     * @return 
     */
    public Date getFecha_garantia() {
        return fechaGarantia;
    }
    
    /**
     * 
     * @param fecha_garantia 
     */
    public void setFecha_garantia(Date fecha_garantia) {
        this.fechaGarantia = fecha_garantia;
    }
    
    /**
     * 
     * @return 
     */
    public int getValor() {
        return valor;
    }
    
    /**
     * 
     * @param valor 
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * 
     * @return 
     */
    public String getOrden_compra() {
        return ordenCompra;
    }
    
    /**
     * 
     * @param orden_compra 
     */
    public void setOrden_compra(String orden_compra) {
        this.ordenCompra = orden_compra;
    }
    
    /**
     * 
     * @return 
     */
    public int getAsegurado() {
        return asegurado;
    }
    
    /**
     * 
     * @param asegurado 
     */
    public void setAsegurado(int asegurado) {
        this.asegurado = asegurado;
    }
    
    /**
     * 
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }
    
    /**
     * 
     * @param categoria 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /**
     * 
     * @return 
     */
    public int getTiempo_uso() {
        return tiempoUso;
    }
    
    /**
     * 
     * @param tiempo_uso 
     */
    public void setTiempo_uso(int tiempo_uso) {
        this.tiempoUso = tiempo_uso;
    }
    
    /**
     * 
     * @return 
     */
    public String getProveedor() {
        return proveedor;
    }
    
    /**
     * 
     * @param proveedor 
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    /**
     * 
     * @return 
     */
    public String getDescripcion_estado() {
        return descripcionEstado;
    }
    
    /**
     * 
     * @param descripcion_estado 
     */
    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcionEstado = descripcion_estado;
    }
    
    /**
     * 
     * @return 
     */
    public List<Prestamo> getPrestamoEquipo() {
        return prestamoEquipo;
    }

    /**
     * 
     * @param prestamoEquipo 
     */
    public void setPrestamoEquipo(List<Prestamo> prestamoEquipo) {
        this.prestamoEquipo = prestamoEquipo;
    }
    
    /**
     * 
     * @return 
     */
    public String getFoto() {
        return foto;
    }
    
    /**
     * 
     * @param foto 
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * 
     * @return 
     */
    public String getSerial() {
        return serial;
    }
    
    /**
     * 
     * @param serial 
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
    /**
     * 
     * @return 
     */
    public int getPlaca() {
        return placa;
    }
    
    /**
     * 
     * @param placa 
     */
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    /**
     * 
     * @return 
     */
    public String getAccesorios(){
        return this.accesorios;
    }
    
    /**
     * 
     * @param a 
     */
    public void setAccesorios(String a){
        this.accesorios = a;
    }
    
    /**
     * 
     * @return 
     */
    public int getCodigoActivo() {
        return codigoActivo;
    }
    
    /**
     * 
     * @param codigoActivo 
     */
    public void setCodigoActivo(int codigoActivo) {
        this.codigoActivo = codigoActivo;
    }

}
 