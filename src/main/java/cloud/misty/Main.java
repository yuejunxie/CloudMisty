package cloud.misty;

import cloud.misty.common.util.DigitUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xieyuejun
 * @created 2017/10/12
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
}
