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
    Descripcion     VARCHAR(100)    NOT NULL
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
    CONSTRAINT Cultivo_Parcela	FOREIGN KEY (IdParcela)     REFERENCES TParcela(IdFinca),
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
####        TFinca
####################################
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES ("Primera laRomana","La Romana","Descripcion de una parcela de la romana");
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES ("segunda laRomana","La Romana","Segunda escripcion de una parcela de la romana");



SELECT * FROM TParcela;  


####################################
####        TTipo
####################################
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Brocoli","El brócoli, es una de las verduras más saludables y ricas que podemos preparar en la cocina, porque además queda bien de muchas formas diferentes.");
INSERT INTO TTipo (Nombre,Descripcion) VALUES ("Patata","La patata, es una planta perteneciente a la familia de las solanáceas originaria de Sudamérica y cultivada por todo el mundo");

SELECT * FROM TTipo;  


####################################
####        TVariedad
####################################
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Roja","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pequeña","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Baraca","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Draga","Patata");

INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Morado","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Romanescu","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bimi","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Chino","Brocoli");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Calabrese","Brocoli");

SELECT * FROM TVariedad;  


















