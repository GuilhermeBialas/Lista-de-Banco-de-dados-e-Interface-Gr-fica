
DROP DATABASE EXISTS exercicio_01_Lista_10;
CREATE DATABASE IF NOT EXISTS exercicio_01_Lista_10;

USE exercicio_01_Lista_10;

CREATE TABLE alunos(
id                    INT AUTO_INCREMENT PRIMARY KEY,
nome                  VARCHAR(100)NOT NULL,
codigo_matricula      VARCHAR(100),
nota_1                FLOAT,
nota_2                FLOAT,
nota_3                FLOAT,
frequencia            TINYINT
); 