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

CREATE TABLE kurir(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(40),
    created_at DATE,
    updated_at int,
    PRIMARY KEY (id)
);

INSERT INTO
    operator
VALUES
    (
        NULL,
        'lazada',
        '2022-04-13 02:40:06',
        '2022-04-19 02:40:06'
    ),
    (
        NULL,
        'tokopedia',
        '2018-04-11 02:40:06',
        '2022-04-19 02:40:06'
    ),
    (
        NULL,
        'blibi',
        '2017-04-12 02:40:06',
        '2017-04-17 02:40:06'
    ),
    (
        NULL,
        'toko aja',
        '2016-04-13 02:40:06',
        '2022-04-19 02:40:06'
    ),
    (
        NULL,
        'amazon',
        '2015-04-03 02:40:06',
        '2015-04-10 02:40:06'
    );

INSERT INTO
    type_product
VALUES
    (
        NULL,
        'besar',
        '2014-04-07 03:05:51',
        '2018-04-10 03:05:51'
    ),
    (
        NULL,
        'sedang',
        '2016-04-01 03:05:51',
        '2018-04-01 03:05:51'
    ),
    (
        NULL,
        'kecil',
        '2016-04-04 03:05:51',
        '2018-04-01 03:05:51'
    );

INSERT INTO
    `product` (
        `id_product`,
        `product_type_id`,
        `operator_id`,
        `code`,
        `name`,
        `status`,
        `created_at`,
        `updated_at`
    )
VALUES
    (
        NULL,
        '1',
        '3',
        'tes',
        'hafizs',
        '1',
        '2021-04-21 03:57:20',
        '2022-04-01 03:57:20'
    ),
    (
        NULL,
        '1',
        '3',
        'tes1',
        'fauzi',
        '',
        '2021-04-14 03:57:20',
        '2020-04-15 03:57:20'
    ),
    (
        NULL,
        '2',
        '1',
        'tes2',
        'ritonga',
        '1',
        '2022-04-01 04:00:51',
        '2022-04-01 04:00:51'
    ),
    (
        NULL,
        '2',
        '1',
        'tes3',
        'mia',
        '1',
        '2022-03-09 04:00:51',
        '2022-03-31 04:00:51'
    ),
    (
        NULL,
        '3',
        '4',
        'tes1',
        'shobing',
        '5',
        '2022-03-05 04:00:51',
        '2022-03-29 04:00:51'
    ),
    (
        NULL,
        '3',
        '4',
        'tesafgs',
        'azira',
        '5',
        '2022-03-15 04:07:07',
        '2022-03-31 04:07:07'
    );

INSERT INTO
    product_descriptions
VALUES
    (
        '5',
        'hallo',
        '2022-04-02 02:59:13',
        '2022-04-02 02:59:13'
    ),
    (
        '3',
        'hallo juga',
        '2022-04-02 02:59:13',
        '2022-04-01 02:59:13'
    ),
    (
        '1',
        'tes',
        '2022-04-01 03:00:01',
        '2022-04-02 03:00:01'
    ),
    (
        '4',
        'apa ?',
        '2022-04-01 03:00:01',
        '2022-04-02 03:00:01'
    ),
    (
        '2',
        'ayaok',
        '2022-04-01 03:00:01',
        '2022-04-02 03:00:01'
    );

INSERT INTO
    `payment_method` (
        `id_payment`,
        `name`,
        `status`,
        `created_at`,
        `updated_at`
    )
VALUES
    (
        NULL,
        'ovo',
        '12',
        '2022-04-13 02:16:13',
        '2022-04-19 02:16:13'
    ),
    (
        NULL,
        'gopay',
        '',
        '2022-04-01 03:10:31',
        '2022-04-01 03:10:31'
    ),
    (
        NULL,
        'shopee',
        '',
        '2022-04-01 03:10:31',
        '2022-04-02 03:10:31'
    );

INSERT INTO
    user (
        `id_user`,
        `status`,
        `dob`,
        `gender`,
        `created_at`,
        `updated_at`
    )
VALUES
    (
        NULL,
        'on',
        '2022-04-01',
        'M',
        '2022-04-01 03:31:37',
        '2022-04-02 03:31:37'
    ),
    (
        NULL,
        'aktif',
        '2022-03-30',
        'F',
        '2022-04-01 03:31:37',
        '2022-04-01 03:31:37'
    ),
    (
        NULL,
        'On',
        '2022-04-01',
        'M',
        '2022-04-01 03:32:49',
        '2022-04-02 03:32:49'
    ),
    (
        NULL,
        'on',
        '2022-04-01',
        'F',
        '2022-04-01 03:32:49',
        '2022-04-01 03:32:49'
    ),
    (
        NULL,
        'off',
        '2022-03-31',
        'M',
        '2022-04-01 03:32:49',
        '2022-04-01 03:32:49'
    );
    INSERT INTO
    transaksi
        
VALUES
    (
        NULL,
        '1',
        '1',
        'on',
        '12',
        '50',
        '2022-04-01 03:25:28',
        '2022-04-02 03:25:28'
    ),
    (
        NULL,
        '2',
        '2',
        'aktif',
        '23',
        '200000',
        '2017-04-12 02:27:06',
        '2022-04-02 03:10:31'
    ),
    (
        NULL,
        '3',
        '3',
        'On',
        '45',
        '21',
        '2022-04-01 03:26:49',
        '2022-04-02 03:26:49'
    );
    INSERT INTO `transaksi` (`id_transaksi`, `id_user`, `payment_method_id`, `status`, `total_qty`, `total_price`, `created_at`, `updated_at`) VALUES (NULL, '1', '1', 'on', '12', '50', '2022-04-01 03:25:28', '2022-04-02 03:25:28'), (NULL, '2', '2', 'aktif', '23', '200000', '2017-04-12 02:27:06', '2022-04-02 03:10:31'), (NULL, '3', '3', 'On', '45', '21', '2022-04-01 03:26:49', '2022-04-02 03:26:49');
    SELECT * FROM user WHERE gender = "M";
    SELECT * FROM product wHERE id_product ="3";
    SELECT * FROM user WHERE created_at BETWEEN date_sub(now(), interval 1 week) AND date_add(now(), interval 3 day);
    SELECT COUNT(*) AS total FROM user WHERE gender = "F";
    SELECT * FROM product ORDER BY name ASC;

    SELECT * FROM product LIMIT 5;

    UPDATE product SET name = 'product dummy' WHERE id_product = 1;
    UPDATE transaksi SET total_qty = '3' WHERE id_transaksi = 1;

    DELETE FROM product WHERE id_product ='1';
    DELETE FROM product WHERE product_type_id ='1';

    SELECT * FROM `transaksi` ORDER BY `transaksi`.`id_transaksi` LIMIT 2;
    SELECT total_price FROM transaksi WHERE id_transaksi='1';
    SELECT total_price FROM transaksi WHERE payment_method_id = '2';
    SELECT product.id_product, product_type.name FROM product INNER JOIN product_type ON product.id_product = product_type.id;
    SELECT status FROM transaksi UNION SELECT name FROM product UNION SELECT status FROM user;
    SELECT * FROM product WHERE EXISTS (SELECT * FROM transaksi);