package www.coisini.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "www.coisini.xyz.dao")
@SpringBootApplication
public class FoodTrucksApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodTrucksApplication.class,args);
    }
}