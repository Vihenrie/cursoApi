Create Table Curso(
    id int not null auto_increment primary key,
    nomecurso varchar(150)
);

alter table Aluno add CONSTRAINT FK_Curso_Aluno foreign key(id_curso) references Curso(id);
alter table Aluno add CONSTRAINT FK_Cidade_Aluno foreign key(id_cidade) references Cidade(id);

insert into Cidade(nomecidade, uf) values ('Lençóis Paulista', "SP");
insert into Cidade(nomecidade, uf) values ('Belém', 'PA');
insert into Cidade(nomecidade, uf) values ('Rio de Janeiro', "RJ");
insert into Cidade(nomecidade, uf) values ('Alcântara ', "MA");
insert into Cidade(nomecidade, uf) values ('Alvarães', "AM");
insert into Cidade(nomecidade, uf) values ('Vitória ', "ES");
insert into Cidade(nomecidade, uf) values ('Cuiabá', "MG");
insert into Cidade(nomecidade, uf) values ('Manaus', "AM");
insert into Cidade(nomecidade, uf) values ('Feliz Natal', "MG");
insert into Cidade(nomecidade, uf) values ('Salvador', "BA");
insert into Cidade(nomecidade, uf) values ('Macapá', "AP");
insert into Cidade(nomecidade, uf) values ('Botucatu', "SP");

insert into Curso(nomecurso) values ('Desenvolvimento de sistemas');
insert into Curso(nomecurso) values ('Quimica');
insert into Curso(nomecurso) values ('Marketing');
insert into Curso(nomecurso) values ('Administração');
insert into Curso(nomecurso) values ('Logistica');
insert into Curso(nomecurso) values ('Contabilidade');
insert into Curso(nomecurso) values ('Edificações');
insert into Curso(nomecurso) values ('Agronomia');
insert into Curso(nomecurso) values ('Artes');
insert into Curso(nomecurso) values ('Astronomia');
insert into Curso(nomecurso) values ('Ciencias da computações');
insert into Curso(nomecurso) values ('Biomedicina');

insert into Aluno(nomeAluno, id_cidade, id_curso) values ('João Marcos', 6, 2);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Vinicius Henrique', 7, 12);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Pedro Henrique', 11, 6);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Bianca Barbosa', 7, 8);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Marcela Martins', 8, 10);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Matheus Henrique', 3, 11);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Vitor Lopes', 5, 1);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Lucas Vieira', 12, 4);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Rogerio Furlan', 11,3);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Marco Aurelio', 7, 7);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Arthur Marques', 2, 9);
insert into Aluno(nomeAluno, id_cidade, id_curso) values ('Maria Giglioli', 1, 10);

