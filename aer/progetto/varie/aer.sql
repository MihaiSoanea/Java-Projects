
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

    create table volo (
        id int8 not null,
        codice varchar(255),
        internazionale boolean not null,
        luogoArrivo varchar(255),
        merci boolean not null,
        orarioPrevisto timestamp,
        primary key (id)
    );

    alter table utente 
        add constraint UK_7hipuu05v6vcqr7wbl8q7p4t2 unique (nomeUtente);

    alter table volo 
        add constraint UK_rt3ddco3gtx70s70yyrj8tbtv unique (codice);

    create table hibernate_sequences (
         sequence_name varchar(255),
         sequence_next_hi_value int4 
    );
