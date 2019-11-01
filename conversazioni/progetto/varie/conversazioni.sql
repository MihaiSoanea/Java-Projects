
    create table canale (
        id int8 not null,
        data timestamp,
        nome varchar(255),
        owner_id int8,
        primary key (id)
    );

    create table canale_utente (
        listaCanali_id int8 not null,
        listaIscritti_id int8 not null
    );

    create table istruzione (
        id int8 not null,
        comando varchar(255),
        nomeCanale varchar(255),
        utente varchar(255),
        primary key (id)
    );

    create table utente (
        id int8 not null,
        attivo boolean not null,
        lastLogin timestamp,
        nome varchar(255),
        nomeUtente varchar(255),
        ruolo varchar(255),
        primary key (id)
    );

    alter table canale 
        add constraint UK_mi5jyyf91b0gdhe3q41n5quyf unique (nome);

    alter table utente 
        add constraint UK_7hipuu05v6vcqr7wbl8q7p4t2 unique (nomeUtente);

    alter table canale 
        add constraint FK_bo57aosem8phuaxiw6g4vxuhc 
        foreign key (owner_id) 
        references utente;

    alter table canale_utente 
        add constraint FK_5y2efpdrhhi36l238rddeycyj 
        foreign key (listaIscritti_id) 
        references utente;

    alter table canale_utente 
        add constraint FK_2mwuo91am5b2tlqsnlhgxo7t8 
        foreign key (listaCanali_id) 
        references canale;

    create table hibernate_sequences (
         sequence_name varchar(255),
         sequence_next_hi_value int4 
    );
