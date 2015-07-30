package angular 

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan('asset.pipeline.springboot')
class Application {

    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}