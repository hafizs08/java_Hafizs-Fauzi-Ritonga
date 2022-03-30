CREATE TABLE user(
    id_user INT NOT NULL AUTO_INCREMENT,
    nama VARCHAR(40) NOT NULL,
    alamat VARCHAR(100) NOT NULL,
    tglLahir DATE,
    PRIMARY KEY (id_user)
);

CREATE TABLE product(
    id_product INT NOT NULL AUTO_INCREMENT,
    nama_product VARCHAR(40) NOT NULL,
    jenis VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_product)
);

CREATE TABLE product(
    id_product INT NOT NULL AUTO_INCREMENT,
    nama_product VARCHAR(40) NOT NULL,
    jenis VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_product)
);

CREATE TABLE operator(
    id_operator INT NOT NULL AUTO_INCREMENT,
    nama_operator VARCHAR(40),
    PRIMARY KEY (id_operator)
);

CREATE TABLE detail_product(
    id_detail INT NOT NULL AUTO_INCREMENT,
    harga int,
    stock int,
    tanggal_masuk DATE,
    id_product INT NOT NULL,
    PRIMARY KEY (id_detail)
);

CREATE TABLE transaksi(
    id_transaksi INT NOT NULL AUTO_INCREMENT,
    id_user INT NOT NULL,
    id_product INT NOT NULL,
    id_operator INT NOT NULL,
    PRIMARY KEY (id_transaksi)
);

CREATE TABLE payment_method(
    id_payment INT NOT NULL AUTO_INCREMENT,
    nama_payment VARCHAR(40),
    PRIMARY KEY (id_payment)
);