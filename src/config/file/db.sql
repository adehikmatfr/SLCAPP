CREATE TABLE IF NOT EXISTS admin (
    id int primary key auto_increment,
    username varchar(50) not null,
    password varchar(50) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE IF NOT EXISTS pegawai (
    nip binary(16) primary key not null,
    nama varchar(50) not null,
    created_at datetime not null default current_timestamp(),
    updated_at datetime not null on update current_timestamp() default current_timestamp(),
    deleted_at datetime
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE IF NOT EXISTS balance_pegawai(
    id binary(16) primary key not null,
    nip binary(16) not null unique,
    total_amount int default 0,

    FOREIGN KEY (nip) REFERENCES pegawai(nip) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE IF NOT EXISTS transaksi (
    id binary(16) primary key not null,
    nip binary(16) not null,
    type char(1) not null,
    total int not null,
    prev_total_amount int not null,
    total_amount int not null,
    created_at datetime not null default current_timestamp(),

    FOREIGN KEY (nip) REFERENCES pegawai(nip) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
