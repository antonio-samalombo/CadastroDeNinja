-- V1: Migrations para criar a infraestrutura inicial do banco

CREATE TABLE tb_missoes (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            nome VARCHAR(255),
                            dificuldade VARCHAR(255)
);

CREATE TABLE tb_cadastro (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(255),
                             email VARCHAR(255) UNIQUE,
                             img_url VARCHAR(255),
                             idade INT,
                             missoes_id BIGINT,
                             FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id)
);