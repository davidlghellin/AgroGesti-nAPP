# source /home/david/NetBeansProjects/AgroGestiónAPP/src/documentacion/script.sql;
DROP DATABASE BAgroGestion;
CREATE DATABASE BAgroGestion;
USE BAgroGestion;

CREATE TABLE TFinca
(
    Nombre          VARCHAR(20)     PRIMARY KEY,
    Localizacion    VARCHAR(20)     NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TParcela
(
    IdParcela       VARCHAR(20)     PRIMARY KEY,
    IdFinca         VARCHAR(20)     NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL,
    CONSTRAINT Parcela_Finca	FOREIGN KEY (IdFinca) REFERENCES TFinca(Nombre)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TTipo
(    
    Nombre          VARCHAR(20)     PRIMARY KEY,
    Descripcion     VARCHAR(300)    NOT NULL
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TVariedad
(
    Nombre          VARCHAR(20)     PRIMARY KEY,
    IdTipo          VARCHAR(20)     NOT NULL,
    CONSTRAINT Variedad_Tipo	FOREIGN KEY (IdTipo) REFERENCES TTipo(Nombre)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TCultivar
( 
    Id              INT             PRIMARY KEY AUTO_INCREMENT,
    FechaInicio     DATE            NOT NULL,
    FechaFin        DATE            NOT NULL,
    IdVariedad      VARCHAR(20)     NOT NULL,
    IdParcela       VARCHAR(20)     NOT NULL,
    CONSTRAINT Cultivo_Parcela	FOREIGN KEY (IdParcela)     REFERENCES TParcela(IdParcela),
    CONSTRAINT Cultivo_Variedad	FOREIGN KEY (IdVariedad)    REFERENCES TVariedad(Nombre)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TIngresoVenta
(
    Fecha           DATE            PRIMARY KEY,
    NombreCliente   VARCHAR(20)     NOT NULL,
    PrecioUnidad    FLOAT           NOT NULL,
    Cantidad        FLOAT           NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT IngresoVenta_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TIngresoOtro
(
    Fecha           DATE            PRIMARY KEY,
    Procedencia     VARCHAR(20)     NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT IngresoOtro_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;


CREATE TABLE TGastosManoObra
(
    Id              INT             PRIMARY KEY AUTO_INCREMENT,       
    FechaInicio     DATE            NOT NULL,
    FechaFin        DATE            NOT NULL,
    Categoria       INT             NOT NULL,
    DNI             VARCHAR(10)     NOT NULL,
    Tipo            ENUM('Horas','Dias') NOT NULL DEFAULT 'Dias',
    CantidadTipo    INT             NOT NULL,
    PrecioTipo      FLOAT           NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT GastosManoObra_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TGastoProducto
(
    Id              INT             PRIMARY KEY AUTO_INCREMENT,       
    FechaFatura     DATE            NOT NULL,
    Proveedor       VARCHAR(20)     NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL,
    Cantidad        FLOAT           NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT GastoProducto_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TGastoOtro
(
    Id              INT             PRIMARY KEY AUTO_INCREMENT,       
    FechaFatura     DATE            NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT GastoOtro_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;



############INFO####################
SHOW FULL TABLES FROM BAgroGestion;

############INSERT##################

####################################
####        TFinca
####################################
INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES ("La Romana","Albacete","Finca especializada en brocolis");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES ("La Gineta","Albacete","Finca especializada en patatas");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES ("Las Cobatillas","Albacete","Finca para la caza gracias a la viña");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES ("Pinilla","Albacete","La mejo finca de todas al lado de Molinicos");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES ("Fuente Higuera","Albacete","Finca donde reposan los toros");

SELECT * FROM TFinca;  

####################################
####        TParcela
####################################
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES ("Primera LaRomana","La Romana","Descripcion de una parcela de la romana");
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES ("Segunda LaRomana","La Romana","Segunda escripcion de una parcela de la romana");



SELECT * FROM TParcela;  


####################################
####        TTipo
####################################
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Brocoli","El brócoli, es una de las verduras más saludables y ricas que podemos preparar en la cocina, porque además queda bien de muchas formas diferentes.");
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Patata","La patata, es una planta perteneciente a la familia de las solanáceas originaria de Sudamérica y cultivada por todo el mundo.");
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Zanahoria","La zanahoria,una hortaliza que pertenece a la familia de las umbelíferas, también denominadas apiáceas, y considerada la especie más importante y de mayor consumo dentro de esta familia.");
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Tomate","El tomáte, es una especie de la familia de las solanáceas originaria de América (desde México a norte de Chile) y cultivada en todo el mundo para su consumo tanto fresco como procesado de diferentes modos.");

SELECT * FROM TTipo;  


####################################
####        TVariedad
####################################
####    Patatas
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Roja","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pequeña","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Baraca","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Draga","Patata");
####    Brocolis
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Morado","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Romanescu","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bimi","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Chino","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Calabrese","Brocoli");
####    Zanahoria
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bangor","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Berlin","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bermuda","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Cordoba","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Komarno","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Mokum","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Napoli","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Namur","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Nerja","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Naval","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Nevis","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Natuna","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Niagara","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Namibia","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Norfolk","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Norwalk","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Nerac","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Yellowstone","Zanahoria");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("White Satin","Zanahoria");
####    Tomate
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Anna russian","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Applause","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Aussie","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Baladre","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bella rosa","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Black cherry","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Black russian","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Blondkopfchen","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bombilla","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Brandywine","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Carbon","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Ceylan","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Cherokee purple","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Cherry pera amarillo","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Cirneta negra","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Ciruela negro","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Colgar en rama","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Comanche","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Copia","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Costoluto genovese","Tomate");


SELECT * FROM TVariedad;  


####################################
####        TCultivar
####################################
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('1999-01-01','1999-01-03',"Calabrese","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('1999-01-01','1999-01-03',"Calabrese","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2000-01-01','2000-01-03',"Calabrese","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2000-01-01','2000-01-03',"Calabrese","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2001-01-01','2001-01-03',"Calabrese","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2001-01-01','2001-01-03',"Calabrese","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2002-01-01','2002-01-03',"Calabrese","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) VALUES ('2002-01-01','2002-01-03',"Calabrese","Segunda LaRomana");

SELECT * FROM TCultivar;  



####################################
####        TIngresoVenta
####################################
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-01',"David L.G.","1.2","1000","120000","1");
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-02',"David L.G.","1.2","10000","1200000","2");


SELECT * FROM TIngresoVenta;  


####################################