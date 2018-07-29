
DROP DATABASE IF EXISTS exercicio_banco_01;
CREATE DATABASE IF NOT EXISTS exercicio_banco_01;
USE exercicio_banco_01;

CREATE TABLE alunos(
id                int AUTO_INCREMENT PRIMARY KEY,
nome              VARCHAR(300),
codigo_matricula  VARCHAR(20),
nota_1            FLOAT,
nota_2            FLOAT,
nota_3            FLOAT,
media   Float,
frequencia        TINYINT 
);
