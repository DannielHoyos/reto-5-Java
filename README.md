# reto-5-Java
Misión Tic 2022 Ciclo #2 Universidad Nacional

El objetivo de este reto es desarrollar una aplicación en Java que permita:
·         La creación, consulta, actualización y eliminación. De las entidades descritas a continuación. Tenga en cuenta que no es necesario realizar una interfaz de usuario (grafica opcional) para las diferentes operaciones, estas pueden ser implementadas en Java y se prueban directamente desde el método main(), es decir, una aplicación de consola.





create schema inventario;

use inventario;



create table productos

(

  pr_id int primary key auto_increment,

  pr_codigo varchar(10),

  pr_descripcion varchar(100),

  pr_precio_unitario int

);



create table movimientos

(

  mo_id int primary key auto_increment,

  pr_id int,

  mo_cantidad int,

  mo_tipo int,

  foreign key (pr_id) references productos(pr_id)

);

