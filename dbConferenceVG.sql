create database dbConferenceVG;
use dbConferenceVG;

drop database dbConferenceVG;

/* creaciones de tablas */
create table PARTICIPANTE
(
	IDPAR INT auto_increment primary key ,
    FECREGPAR date,
    NOMPAR varchar(60) ,
    APEPAR varchar(80),
    DNIPAR char(8),
    TIPPAR char(1),
    CELPAR char(9),
    EMAPAR varchar(90),
    DIRPAR varchar(90),
    ESTPAR char(1)
);


create table PONENTE
(
	CODPON char(5) primary key,
    NOMPON varchar(60),
    APEPON varchar(80),
    CELPON char(9),
    DNIPON char(8),
    EMAPON varchar(90),
    DIRPON varchar(90)
);

create table CONFERENCIA
(
	CODCONF char(5) primary key,
    TEMCONF varchar(90),
    FECCONFPONCONF date ,
    CODPON char(5)
);

create table REGISTRO
(
	CODREG char(5) primary key, 
    FECREG date,
    CERTREG char(1),
    IDPAR INT
);

create table REGISTRODETALLE
(
	IDREGDET INT auto_increment primary key,
    CANTPART int,
    CODREG char(5),
    CODCONF char(5)
);


/* creaciones de claves foraneas */

alter table REGISTRO
	add constraint REGISTRO foreign key (IDPAR) references PARTICIPANTE(IDPAR);

alter table CONFERENCIA
	add constraint CONFERENCIA foreign key (CODPON) references PONENTE(CODPON);

alter table REGISTRODETALLE
	add constraint REGISTRODETALLE_conferencia foreign key (CODCONF) references CONFERENCIA(CODCONF);

alter table REGISTRODETALLE
	add constraint REGISTRODETALLE foreign key (CODREG) references REGISTRO(CODREG);

insert into PARTICIPANTE
( NOMPAR, APEPAR, DNIPAR, TIPPAR, CELPAR, EMAPAR, DIRPAR, ESTPAR)
values
("Juan","Campos Pérez","40255133","1","986512478","juan.Campos@vallegrande.edu.pe","AV.Miraflores","A"),
("Sofia","Sofia Avila","64978531","1","974815258","Sofia.Sofias@vallegrande.edu.pe","Jr.Huallaga","A"),
("María","Rosales Guerra","15925874","1","986512478","maría.Rosales@vallegrande.edu.pe","Calle Girasoles","A"),
("Marco","Alarcón Hermosa","48781512","2","986512478","marcos.martín@vallegrande.edu.pe","","A"),
("Martín","Samán Arata","84152631","2","986512478","martin.saman@vallegrande.edu.pe","Jr.La Unión","A"),
("José","Quispe Luyo","48161937","2","986512478","jose.quispe@vallegrande.edu.pe","Calle Abancay","A"),
("Claudia","Barraza carrasco","78452596","3","986512478","cbarraza@gmail.com","Jr.Las Gardenias","A"),
("Jhoana","Bendezú Anccasi","74321564","3","986512478","jbendezu@yahoo.com","","A"),
("Mario","Acosta Paloino","15326499","3","986512478","mario.acosta@outlook.com","AV.Miraflores","A");

select * from PONENTE;

insert into PONENTE
(CODPON, NOMPON, APEPON, CELPON, DNIPON, EMAPON, DIRPON)
values
("P0001","Alberto","Corrales Lozada","","15263798","alberto.corrales@yahoo.com","Calle Los Portales"),
("P0002","Juana","Sánches Ortega","974815258","15263798","alberto.corrales@yahoo.com","Calle Los Portales"),
("P0003","Javier","Nakasone Vila","995236147","15263798","alberto.corrales@yahoo.com","Calle Los Portales"),
("P0004","Sonia","Huayta Medina","","15263798","alberto.corrales@yahoo.com","Calle Los Portales"),
("P0005","Fabiano","Carrión Avila","","15263798","alberto.corrales@yahoo.com","Calle Los Portales");

select * from CONFERENCIA;

insert into CONFERENCIA
(CODCONF, TEMCONF, FECCONFPONCONF, CODPON)
values
("C0001","Gestión de base con MySQL","15/7/2022","P0001"),
("C0002","Joins paso a paso","16/7/2022","P0002"),
("C0003","Consultas con parámetros","17/7/2022","P0003"),
("C0004","Administracion base de datos MySQL","16/7/2022","P0002"),
("C0005","Gestión de backups de Base de Datos","15/7/2022","P0004");

select * from REGISTRO ;


insert into REGISTRO
(CODREG, FECREG, CERTREG )
values
("R0001","1","S"),
("R0002","3","S"),
("R0003","4","S"),
("R0004","7","S"),
("R0005","2","N"),
("R0006","5","N"),
("R0007","6","N"),
("R0008","9","N");

select * from REGISTRODETALLE ;
describe REGISTRODETALLE;

insert into REGISTRODETALLE
( CANTPART, CODREG, CODCONF)
values
("2","R0001","C0001"),
("1","R0001","C0002"),
("4","R0002","C0001"),
("1","R0002","C0003"),
("1","R0003","C0004"),
("2","R0004","C0005"),
("3","R0005","C0005"),
("3","R0005","C0003"),
("3","R0006","C0002"),
("4","R0006","C0003"),
("2","R0007","C0005"),
("6","R0007","C0003"),
("1","R0008","C0005");










































