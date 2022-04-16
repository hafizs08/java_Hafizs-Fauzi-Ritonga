 CrudRepository yang berisi metode untuk operasi CRUD. Ini menyediakan operasi Crud generik pada repositori. Ini didefinisikan dalam paket org.springframework.data.repository dan memperluas antarmuka Spring Data Repository . Jika seseorang ingin menggunakan CrudRepository di aplikasi spring boot, dia harus membuat antarmuka dan memperluas antarmuka CrudRepository. 

 JpaRepository adalah ekstensi khusus JPA (Java Persistence API) dari Repositori. Ini berisi API lengkap CrudRepository dan PagingAndSortingRepository . Jadi ini berisi API untuk operasi CRUD dasar dan juga API untuk pagination dan sorting.  

GET, dalam penggunaannya method untuk kelompok HTTP verb ini adalah untuk mengambil atau membaca data.  Method pada kelompok ini biasanya mengembalikan suatu keluaran/output yang kadang bisa disebut sebagai function

POST, dalam penggunaannya method untuk kelompok HTTP verb ini adalah untuk membuat (create) item/resource baru.  Kelompok method ini biasanya tidak mengembalikan keluaran/output yang kadang disebut procedure

PUT, dalam penggunaannya method untuk kelompok HTTP verb ini adalah untuk mengupdate item/resource yang telah ada

DELETE, dalam penggunaannya method untuk kelompok HTTP verb ini adalah untuk menghapus item/resource yang telah ada