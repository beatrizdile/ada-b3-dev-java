create table professores(
	id_professor integer,
	celular varchar(14),
	nome varchar(40),
	id_disciplina integer,
	primary key (id_professor),
	foreign key (id_disciplina)
	references disciplinas(id_disciplina)
)

create table livros(
	nome varchar(15),
	autor varchar(40),
	sinopse varchar(500)
)
