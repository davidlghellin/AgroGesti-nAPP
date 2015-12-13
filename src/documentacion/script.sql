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
    Id              INT             PRIMARY KEY AUTO_INCREMENT,
    Fecha           DATE            NOT NULL,
    NombreCliente   VARCHAR(20)     NOT NULL,
    PrecioUnidad    FLOAT           ,
    Cantidad        FLOAT           ,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT IngresoVenta_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TIngresoOtro
(
    Id              INT             PRIMARY KEY AUTO_INCREMENT,
    Fecha           DATE            NOT NULL,
    Procedencia     VARCHAR(20)     NOT NULL,
    Descripcion     VARCHAR(100)    NOT NULL,
    Total           FLOAT           NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT IngresoOtro_Cultivar	FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id)
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TTrabajador
(
    DNI             VARCHAR(10)     PRIMARY KEY,       
    Nombre          VARCHAR(10)     NOT NULL
)CHARACTER SET utf8 COLLATE utf8_spanish_ci;

CREATE TABLE TGastosManoObra
(
    Id              INT             PRIMARY KEY AUTO_INCREMENT,       
    FechaInicio     DATE            NOT NULL,
    FechaFin        DATE            NOT NULL,
    Categoria       INT             NOT NULL,
    DNI             VARCHAR(10)     NOT NULL,
    Tipo            ENUM('Horas','Dias') NOT NULL DEFAULT 'Dias',
    CantidadTipo    FLOAT             ,
    PrecioTipo      FLOAT           ,
    Total           FLOAT           NOT NULL,
    Descripcion     VARCHAR(300)    NOT NULL,
    IdCultivar      INT             NOT NULL,
    CONSTRAINT GastosManoObra_Cultivar      FOREIGN KEY (IdCultivar) REFERENCES TCultivar(Id),
    CONSTRAINT GastosManoObra_Trabajador    FOREIGN KEY (DNI) REFERENCES TTrabajador(DNI)
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
INSERT INTO TFinca (Nombre,Localizacion,Descripcion)  
    VALUES ("La Romana","Albacete","Finca especializada en brocolis");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion)  
    VALUES ("La Gineta","Albacete","Finca especializada en patatas");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion)  
    VALUES ("Las Cobatillas","Albacete","Finca para la caza, gracias a la viña");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion)  
    VALUES ("Pinilla","Albacete","La mejor finca de todas, al lado de Molinicos");   
INSERT INTO TFinca (Nombre,Localizacion,Descripcion)  
    VALUES ("Fuente Higuera","Albacete","Finca donde reposan los toros");

SELECT * FROM TFinca;  

####################################
####        TParcela
####################################
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion)  
    VALUES ("Primera LaRomana","La Romana","Descripcion de una parcela de la romana");
INSERT INTO TParcela (IdParcela,IdFinca,Descripcion)  
    VALUES ("Segunda LaRomana","La Romana","Segunda escripcion de una parcela de la romana");



SELECT * FROM TParcela;  


####################################
####        TTipo
####################################
INSERT INTO TTipo (Nombre,Descripcion)  
    VALUES ("Brocoli","El brócoli, es una de las verduras más saludables y ricas que podemos preparar en la cocina, porque además queda bien de muchas formas diferentes.");
INSERT INTO TTipo (Nombre,Descripcion)  
    VALUES ("Patata","La patata, es una planta perteneciente a la familia de las solanáceas originaria de Sudamérica y cultivada por todo el mundo.");
INSERT INTO TTipo (Nombre,Descripcion)  
    VALUES ("Zanahoria","La zanahoria,una hortaliza que pertenece a la familia de las umbelíferas, también denominadas apiáceas, y considerada la especie más importante y de mayor consumo dentro de esta familia.");
INSERT INTO TTipo (Nombre,Descripcion)  
    VALUES ("Tomate","El tomáte, es una especie de la familia de las solanáceas originaria de América (desde México a norte de Chile) y cultivada en todo el mundo para su consumo tanto fresco como procesado de diferentes modos.");
INSERT INTO TTipo (Nombre,Descripcion)  
    VALUES ("Cebolla","La cebolla es uno de los ingredientes que más utilizamos en la cocina. Ya sea cruda, en ensaladas, rebozada y frita, o picada para preparar todo tipo de platos, desde un buen guiso de carne hasta un pescado al horno.");

SELECT * FROM TTipo;  


####################################
####        TVariedad
####################################
####    Patatas
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Agria","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Baraca","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Bintje","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Buffet","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Caesar","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Draga","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Felix","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Flamenco","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Jaerla","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Kennebec","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Monalisa","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Nagore","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pequeña","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Roja","Patata");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Spunta","Patata");
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
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Ditmarcher","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Eros","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Gallego","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Glacier","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Gartenperle","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Green sausage","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Grushovka","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Harzfeuer","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Hugh","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Japanesse black","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Jersey devil","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Kosovo","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Krim negro","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Kumato","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Liguria","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Limachino","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Lime green salad","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Manitoba","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Marvel stripe","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Montserrat macizo","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Muchamiel","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Opalka","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Optima","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pata negra","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Patio","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pera de Girona","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Pera negra","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Piña hawaiana","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Rio grande","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("San marzano","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Siberian","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Sprite","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Sugary","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Sun sugar","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Tigerella","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Tomatillo","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Valenciano","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("White Queen","Tomate");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Window box Roma","Tomate");
####    Cebolla
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Amarilla","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Cabezona blanca","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Dorada","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Dulce","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Larga","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Morada","Cebolla");
INSERT INTO TVariedad (Nombre,IdTipo) VALUES ("Puerro","Cebolla");

SELECT * FROM TVariedad;  


####################################
####        TCultivar
####################################
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela) 
    VALUES ('1999-01-01','1999-01-03',"Morada","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('1999-01-01','1999-01-03',"Japanesse black","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2000-01-01','2000-01-03',"Puerro","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2000-01-01','2000-01-03',"Baladre","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2001-01-01','2001-01-03',"Larga","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2001-01-01','2001-01-03',"Patio","Segunda LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2002-01-01','2002-01-03',"Dorada","Primera LaRomana");
INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela)  
    VALUES ('2002-01-01','2002-01-03',"Kumato","Segunda LaRomana");

SELECT * FROM TCultivar;  


####################################
####        TIngresoVenta
####################################
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-01',"David L.G.","1.2","1000","120000","1");
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-02',"David L.G.","1.2","10000","1200000","2");
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-02',"David L.G.","1.2","10000","1200000","3");
INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) 
    VALUES ('2002-01-02',"David L.G.","1.2","10000","1200000","4");

SELECT * FROM TIngresoVenta;  


####################################
####        TIngresoOtro
####################################
INSERT INTO TIngresoOtro (Fecha,Procedencia,Descripcion,Total,IdCultivar) 
    VALUES ('2002-01-01',"EEUU","Subvención de los EEUU","10000","1");
INSERT INTO TIngresoOtro (Fecha,Procedencia,Descripcion,Total,IdCultivar) 
    VALUES ('2002-03-01',"UE","Subvención de los Europa por mantener la siembra","2000","2");
INSERT INTO TIngresoOtro (Fecha,Procedencia,Descripcion,Total,IdCultivar) 
    VALUES ('2003-03-01',"España","Subvención por dar trabajo a personas en paro","1900","3");
INSERT INTO TIngresoOtro (Fecha,Procedencia,Descripcion,Total,IdCultivar) 
    VALUES ('2004-03-01',"Albacte","Subvención de Albacete por promover la siembra","15000","4");

SELECT * FROM TIngresoOtro;  


####################################
####        TTrabajador
####################################
INSERT INTO TTrabajador (DNI,Nombre) VALUES ("12345600J","Pepe");
INSERT INTO TTrabajador (DNI,Nombre) VALUES ("53138898X","Andres");
INSERT INTO TTrabajador (DNI,Nombre) VALUES ("11223344T","Juan");
INSERT INTO TTrabajador (DNI,Nombre) VALUES ("53149135R","David");
INSERT INTO TTrabajador (DNI,Nombre) VALUES ("5146078K","Agustin");

SELECT * FROM TTrabajador;  


####################################
####        TGastosManoObra
####################################
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-01-02','2015-01-03',"2","12345600J","Dias","2","66","122","Podar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-01-03','2015-01-03',"2","53138898X","Dias","1","99","99","Labrar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-02-02','2015-02-03',"2","12345600J","Dias","2","66","122","Podar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-02-03','2015-02-03',"2","53138898X","Dias","1","99","99","Labrar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-03-02','2015-03-03',"2","12345600J","Dias","2","66","122","Podar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-03-03','2015-03-03',"2","53138898X","Dias","1","99","99","Labrar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-04-02','2015-04-03',"2","12345600J","Dias","2","66","122","Podar","2");
INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) 
    VALUES ('2015-04-03','2015-04-03',"2","53138898X","Dias","1","99","99","Labrar","2");

####################################
####        TGastoProducto
####################################
INSERT INTO TGastoProducto (FechaFatura,Proveedor,Descripcion,Cantidad,Total,IdCultivar) 
    VALUES ('2012-01-02',"PEPE","Peazo gastazo de pepe","333","4444","1");
INSERT INTO TGastoProducto (FechaFatura,Proveedor,Descripcion,Cantidad,Total,IdCultivar) 
    VALUES ('2013-01-02',"PEPE","Peazo gastazo de pepe","333","4444","1");

SELECT * FROM TGastoProducto;  


####################################
####        TGastoOtro
####################################
INSERT INTO TGastoOtro (FechaFatura,Descripcion,Total,IdCultivar) 
    VALUES ('2012-01-02',"Peazo gastazo enero","4444","1");
INSERT INTO TGastoOtro (FechaFatura,Descripcion,Total,IdCultivar) 
    VALUES ('2012-03-02',"Peazo gastazo marzo","555","2");
INSERT INTO TGastoOtro (FechaFatura,Descripcion,Total,IdCultivar) 
    VALUES ('2012-06-02',"Peazo gastazo junio","4666444","2");

SELECT * FROM TGastoOtro;  


####################################
####################################
####################################
SELECT * 
    FROM TIngresoOtro i
    INNER JOIN TCultivar c 
    ON i.IdCultivar=c.Id;  

SELECT i.Fecha as "Fecha de subvención", i.Procedencia,i.Descripcion,i.Total as "Total €",c.IdVariedad,c.IdParcela
    FROM TIngresoOtro i
    INNER JOIN TCultivar c 
    ON i.IdCultivar=c.Id; 