/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence.DaoMybatis;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import edu.eci.pdsw.proyecto.mybatis.mappers.EquipoMapper;
import edu.eci.pdsw.proyecto.mybatis.mappers.RegistroMapper;
import edu.eci.pdsw.proyecto.persistence.DaoEquipo;
import java.sql.Date;
import java.util.List;
import javax.persistence.PersistenceException;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author JuanHerrera
 */
public class DaoEquipoMybatis implements DaoEquipo{
    SqlSession sqlsession = null;
    EquipoMapper mapper = null;
    
    public DaoEquipoMybatis(SqlSession sqls){
        this.sqlsession = sqls;
        mapper = sqlsession.getMapper(EquipoMapper.class);
    }
    @Override
    public Equipo loadEspecific(String placa) throws PersistenceException{
        Equipo e = mapper.loadEquipoBySerial(placa);
        if(e==null){
            throw new PersistenceException("el equipo no existe");
        }
        else{
            return e;
        }
    }

    @Override
    public List<Equipo> loadByModel(String modelo) {
        List<Equipo> equipos = mapper.loadEquiposByModel(modelo);
        if(equipos==null){
            throw new PersistenceException("el modelo no existe");
        }
        else{
            return equipos;
        }
    }

    @Override
    public void save(Equipo e) {
        if (loadEspecific(e.getSerial())==null){
            throw new PersistenceException("El equipo ya esta registrado");
        }else{
            mapper.saveEquipos(e);
        }
    }

    @Override
    public List<Equipo> loadAll() {
        List<Equipo> equipos = mapper.loadAll();
        if(equipos==null){
            throw new PersistenceException("No se encontro ningun equipo");
        }
        else{
            return equipos;
        }
    }
    
    @Override
    public Usuario usuarioDeEquipo(int placa){
        Usuario usuarioEquipo = mapper.usuarioDeEquipo(placa);
       if(usuarioEquipo == null){
           throw new PersistenceException("el equipo no esta prestado");
       }
        return usuarioEquipo;
    }

    @Override
    public void devolucionEquipo(int id_Usuario) {
        mapper.devolucionEquipo(id_Usuario);
    }
    
}
