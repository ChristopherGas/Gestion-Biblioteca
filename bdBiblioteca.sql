
create database Biblioteca;

USE Biblioteca;

CREATE TABLE Autores (
id_autor int PRIMARY KEY AUTO_INCREMENT, 
nombre_autor VARCHAR (50)
);

CREATE TABLE Libros (
id_libro int PRIMARY KEY AUTO_INCREMENT,
nombre_libro VARCHAR (30) NOT NULL,
fecha_lanzamiento_libro DATE NOT NULL,
editorial_libro VARCHAR (30) NOT NULL,
no_paginas_libro INT NOT NULL,
existencia_libro INT NOT NULL,
id_autor INT NOT NULL,
FOREIGN KEY  (id_autor) REFERENCES Autores(id_autor)
);

CREATE TABLE Usuarios(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
nombre_usuario VARCHAR (50) NOT NULL,
direccion_usuario VARCHAR (100) NOT NULL,
sexo_usuario VARCHAR (5) NOT NULL
);

CREATE TABLE Personal(
id_personal INT PRIMARY KEY AUTO_INCREMENT,
nombre_personal VARCHAR (50) NOT NULL,
sexo_personal VARCHAR (5) NOT NULL,
cargo_personal VARCHAR (20) NOT NULL
);

CREATE TABLE Prestamo_libro (
id_prestamo_libro INT PRIMARY KEY AUTO_INCREMENT,
fecha_prestamo_libro DATE NOT NULL,
fecha_retorno_prestamo_libro DATE NOT NULL,
id_libro INT NOT NULL,
FOREIGN KEY  (id_libro) REFERENCES Libros(id_libro),
id_usuario INT NOT NULL,
FOREIGN KEY  (id_usuario) REFERENCES Usuarios(id_usuario),
id_personal INT NOT NULL,
FOREIGN KEY  (id_personal) REFERENCES Personal(id_personal)
);

INSERT INTO `usuarios` VALUES (1,'Itzel Miranda','Andador delfin 125','F'),
(2,'Paul Gaspar','Vicente Gerrero 32','M'),
(3,'Carlos Barragan','Guadalupe Victoria','M');

INSERT INTO `personal` VALUES (1,'Patiño','M','Bibliotecario'),
(2,'Fernanda','F','Bibliotecaria');

INSERT INTO `autores` VALUES 
(1,'Paulo Cohelo'),
(2,'John Katzenbach'),
(3,'Franz Kafka');

INSERT INTO `libros` VALUES (1,'Metamorfosis','1915-10-01','Kurt Wolff Verlag',70,2,3),
(2,'La historia del loco','2004-06-15','Zeta Bolsillo',432,4,2),
(3,'El alquimista','1988-05-02','HarperCollins',172,5,1);

