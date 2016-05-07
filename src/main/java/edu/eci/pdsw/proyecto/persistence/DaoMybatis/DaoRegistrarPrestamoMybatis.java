/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence.DaoMybatis;

import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import javax.persistence.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import edu.eci.pdsw.proyecto.mybatis.mappers.RegistroMapper;
import edu.eci.pdsw.proyecto.persistence.DaoRegistrarPrestamo;

/**
 *
 * @author 2098654
 */
public class DaoRegistrarPrestamoMybatis implements DaoRegistrarPrestamo {
 SqlSession sqlSession=null;
 RegistroMapper mapper=null;
    
    private 
    DaoRegistrarPrestamoMybatis(SqlSession sqls) {
         this.sqlSession = sqls;
         mapper=sqlSession.getMapper(RegistroMapper.class);
    }

    @Override
    public Prestamo loadEspecific(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prestamo> loadAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Prestamo p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
