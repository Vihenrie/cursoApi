Create Table Aluno(
    id int not null auto_increment primary key,
    nomeAluno varchar(60),
    id_curso int not null,
    id_cidade int not null
);