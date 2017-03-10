package devyellow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Admin on 07.03.2017.
 */

@SpringBootApplication
@ComponentScan
public class EschoolApplication{

    public static void main(String [] args){

        SpringApplication.run(EschoolApplication.class,args);

    }
}
