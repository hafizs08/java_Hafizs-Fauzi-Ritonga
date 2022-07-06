no sql mengunakan Dependencies ini 
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
<dependency>

Application Configuration mengunakan 

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}

menggunakan no sql hampir sama dengan sql beda nya hanya menggunakan dependency yang berbeda dan menggunakan mongodb