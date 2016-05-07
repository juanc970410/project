/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence.DaoMybatis;

import edu.eci.pdsw.proyecto.persistence.DaoFactory;
import edu.eci.pdsw.proyecto.persistence.DaoMybatis.DaoEquipoMybatis;
import edu.eci.pdsw.proyecto.persistence.DaoRegistrarPrestamo;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.persistence.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 *
 * @author JuanHerrera
 */
public class DaoFactoryMybatis extends DaoFactory{
    
    private static SqlSessionFactory sqlsf;
    private static SqlSession sqls = null;
    private Properties appProperties=null;
    
    public DaoFactoryMybatis(Properties properties) {
        this.appProperties=properties;
        if (sqlsf==null){
            synchronized(DaoFactoryMybatis.class){
                if (sqlsf==null){
                    sqlsf=getSqlSessionFactory(this.appProperties); 
                }
            }
        }
    }
    
    private SqlSessionFactory getSqlSessionFactory(Properties appProperties) {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(appProperties.getProperty("mybatis-config-file"));
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sqlSessionFactory;
    }

    @Override
    public void beginSession() throws PersistenceException {
        sqls = sqlsf.openSession();
    }

    @Override
    public DaoEquipoMybatis getDaoEquipo() {
        return new DaoEquipoMybatis(sqls);
    }

    @Override
    public void commitTransaction() throws PersistenceException {
        if (sqls!=null){
            sqls.commit();
        }
    }

    @Override
    public void rollbackTransaction() throws PersistenceException {
        if (sqls!=null){
            sqls.rollback();
        }
    }

    @Override
    public void endSession() throws PersistenceException {
        if(sqls!=null){
            sqls.close();
        }
    }

    @Override
    public DaoRegistrarPrestamo getDaoRegistrarPrestamo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
