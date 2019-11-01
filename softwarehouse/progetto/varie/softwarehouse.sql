
    create table radice (
        tipologia varchar(31) not null,
        id int8 not null,
        nome varchar(255),
        indirizzoIP varchar(255),
        nomeDominio varchar(255),
        portale_id int8,
        sezione_id int8,
        primary key (id)
    );

    create table utente (
        id int8 not null,
        attivo boolean not null,
        lastLogin timestamp,
        nome varchar(255),
        nomeUtente varchar(255),
        password varchar(255),
        ruolo varchar(255),
        primary key (id)
    );

    create table view (
        id int8 not null,
        browser varchar(255),
        paese varchar(255),
        tempoSecondi int4 not null,
        urlArrivo varchar(255),
        urlDestinazione varchar(255),
        pagina_id int8,
        primary key (id)
    );

    alter table radice 
        add constraint UK_2e4uvprqooys0ta5huoetodf1 unique (nomeDominio);

    alter table utente 
        add constraint UK_7hipuu05v6vcqr7wbl8q7p4t2 unique (nomeUtente);

    alter table radice 
        add constraint FK_sj2i35iy46288hh933sh9t6m9 
        foreign key (portale_id) 
        references radice;

    alter table radice 
        add constraint FK_miuh45xr2kw0jxht4i7xh3osx 
        foreign key (sezione_id) 
        references radice;

    alter table view 
        add constraint FK_10o5170x47k3tixwj7fiyaoou 
        foreign key (pagina_id) 
        references radice;

    create table hibernate_sequences (
         sequence_name varchar(255),
         sequence_next_hi_value int4 
    );
