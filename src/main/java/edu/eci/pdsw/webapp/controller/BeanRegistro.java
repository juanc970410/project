/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.services.ServicesFacade;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JuanHerrera 
 */
@SessionScoped
@ManagedBean(name = "beanRegistro")
public class BeanRegistro {
    private String modeloEquipoAvanzado;
    private String serial;
    private int placa;
    private String marca;
    private String clase;
    private int vidaUtil;
    private int valor;
    private String foto;
    private boolean estado;
    private String observaciones;
    private Date fecha_Adquisicion;
    private Date fecha_garantia;
    private String orden_compra;
    private List<Equipo> equipos;
    private List<Equipo> equiposFiltrados;
    private String modelo;
    ServicesFacade sf;

    public Equipo getEquipoSeleccionado() {
        return equipoSeleccionado;
    }

    public void setEquipoSeleccionado(Equipo equipoSeleccionado) {
        this.equipoSeleccionado = equipoSeleccionado;
    }
    private Equipo equipoSeleccionado;
    
    public BeanRegistro(){
        this.sf = ServicesFacade.getInstance("applicationconfig.properties");
        this.equipos = sf.listaEquipos();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public List<Equipo> getEquiposFiltrados() {
        return equiposFiltrados;
    }

    public void setEquiposFiltrados(List<Equipo> equiposFiltrados) {
        this.equiposFiltrados = equiposFiltrados;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Date getFecha_Adquisicion() {
        return fecha_Adquisicion;
    }

    public void setFecha_Adquisicion(Date fecha_Adquisicion) {
        this.fecha_Adquisicion = fecha_Adquisicion;
    }

    public Date getFecha_garantia() {
        return fecha_garantia;
    }

    public void setFecha_garantia(Date fecha_garantia) {
        this.fecha_garantia = fecha_garantia;
    }

    public String getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(String orden_compra) {
        this.orden_compra = orden_compra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    private String proveedor;
    
    
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
            
    public String getModeloEquipoAvanzado() {
        return modeloEquipoAvanzado;
    }

    public void setModeloModeloEquipoAvanzado(String modelo) {
        this.modeloEquipoAvanzado = modelo;
    }
    
}
