Create Table Aluno(
    id bigint not null auto_increment primary key,
    nomeAluno varchar(160),
    id_curso int not null,
    id_cidade int not null
);

