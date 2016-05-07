

DROP TABLE IF EXISTS Equipo;

CREATE TABLE Equipo (
  serial varchar(100),
  placa int(50) NOT NULL,
  estado tinyint(1) NOT NULL,
  descripcion varchar(1000) NOT NULL,
  fecha_adquisicion date NOT NULL,
  fecha_garantia date NOT NULL,
  valor int(11) NOT NULL,
  orden_compra varchar(50),
  asegurado tinyint(1) NOT NULL,
  categoria varchar(50),
  tiempo_uso int(11) NOT NULL,
  descripcion_estado varchar(30) NOT NULL,
  proveedor varchar(100) NOT NULL,
  EquipoStock_id int(11) NOT NULL,
  foto varchar(300) NOT NULL ,
  vida_util varchar(50) NOT NULL,
  accesorios varchar(100) NOT NULL,
  PRIMARY KEY (placa),
  KEY fk_Equipo_EquipoStock (EquipoStock_id)
);



DROP TABLE IF EXISTS Equipo_basico;

CREATE TABLE Equipo_basico (
  id int(11) NOT NULL,
  cantidad_total int(11) NOT NULL,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
);




DROP TABLE IF EXISTS EquipoStock;

CREATE TABLE EquipoStock (
  modelo varchar(100) NOT NULL,
  marca varchar(100) NOT NULL,
  id int(11) NOT NULL,
  PRIMARY KEY (id)
);




DROP TABLE IF EXISTS Prestamo;

CREATE TABLE Prestamo (
  id int(11) NOT NULL,
  fecha_prestamo date NOT NULL,
  fecha_devolucion date,
  observaciones varchar(300) ,
  id_entrego int(11) NOT NULL,
  Equipo_placa varchar(50) NOT NULL,
  fecha_estimada date ,
  id_recibio int(11),
  PRIMARY KEY (id),
  KEY Historial_Usuario (id_entrego),
  KEY Prestamo_Equipo (Equipo_placa)
) ;



DROP TABLE IF EXISTS Prestamo_basicos;

CREATE TABLE Prestamo_basicos (
  id int(11) NOT NULL,
  Equipo_basico_id int(11) NOT NULL,
  Usuario_id int(11) NOT NULL,
  observaciones varchar(300) ,
  cantidad int(11) NOT NULL,
  devuelto tinyint(1) NOT NULL,
  PRIMARY KEY (id),
  KEY Prestamo_basicos_Equipo_basico (Equipo_basico_id),
  KEY Prestamo_basicos_Usuario (Usuario_id)
);




DROP TABLE IF EXISTS Usuario;

CREATE TABLE Usuario (
  id int(11) NOT NULL,
  nombre varchar(100) NOT NULL,
  tipo char(1)  NOT NULL COMMENT '(A) Administrador\n(E) Estudiante\n(P) Profesor\n(L) laboratorista',
  PRIMARY KEY (id)
);

