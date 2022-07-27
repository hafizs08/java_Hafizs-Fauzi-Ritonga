Section 28 Java Unit Testing

1. Piramida Unit Test
    Manual Tests, UI Tests, System Tests, Integration Tests, Unit Tests (semakin mudah).
    Unit Tests adalah pengujian terhadap unit /komponen terkecil. 1 file test digunakan untuk menguji 1 class. Unit Tests dilakukan untuk memvalidasi tiap class bekerja dengan baik.

2. Integration Tests vs Unit Tests
    Memanggil API dan menjalankan API secara real time.
    Melakukan test pada tiap class.
    
    Konsep pada Unit Tests:
    - Correctness & Completeness
    - Error handling
    - checking input value (parameter)
    - correctness of output data (return value)
    - optimizing algoritm and performance

3. F.I.R.S.T Principle of Testing
    - Fast karena tidak communicate dengan hal lain
    - Isolated/Independent, satu unit test tidak bergantung dan mengganggu test lain
    - Repeateable, jika dijalankan secara berulang kali, tetap akan menghasilkan output yang sama
    - Self Validating, mengetes isi argumen
    - Thorough, berkaitan dengan completeness, melakukan test terhadap kemungkinan yang akan terjadi.
