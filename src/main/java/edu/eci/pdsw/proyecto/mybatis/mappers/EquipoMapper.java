/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.proyecto.mybatis.mappers;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Equipo_basico;
import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import java.sql.Date;
import static java.util.Collections.list;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author hcadavid
 */
public interface EquipoMapper {
    
    /**
     * Cargar un equipo por serial
     * @param serial del equipo
     * @return 
     */
    public Equipo loadEquipoBySerial(@Param("serialEquipo")String serial);

    /**
     * Consulta todos los equipos ligados a ese modelo
     * @param modelo
     * @return
     */
    public List<Equipo> loadEquiposByModel(@Param("modelo")String modelo);
    
    /**
     * Guardar los datos
     * @param e
     */
    public void saveEquipos(@Param("equipo")Equipo e);
    
    /**
     * Cargar todos los equipos existentes
     * @return lista de todos los equipos
     */
    public List<Equipo> loadAll();
    
    /**
     * Consulta que usuario tiene el equipo que esta con ese codigo.
     * @param placa
     * @return Usuario que tiene el equipo.
     */
    public Usuario usuarioDeEquipo(@Param("codigoEquipo") int placa);
    
    public void devolucionEquipo(@Param("idUsuario") int id_Usuario );
    
}
    
    