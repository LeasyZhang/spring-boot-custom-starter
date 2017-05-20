import net.leasy.MyInfo;
import net.leasy.MyInfoConfig;
import net.leasy.MyInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static net.leasy.MyInfoConfigKey.*;

/**
 * Created by leasy on 17/5/19.
 */
@Configuration
@ConditionalOnClass(MyInfo.class)
@EnableConfigurationProperties(MyInfoProperties.class)
public class MyInfoAutoConfiguration {

    @Autowired
    private MyInfoProperties myInfoProperties;

    @Bean
    @ConditionalOnMissingBean
    public MyInfo myInfo(MyInfoConfig myInfoConfig) {
        return new MyInfo(myInfoConfig);
    }

    @Bean
    @ConditionalOnMissingBean
    public MyInfoConfig myInfoConfig() {
        String name = myInfoProperties.getName() == null ? System.getProperty("info.name") : myInfoProperties.getName();
        String age = myInfoProperties.getAge();
        String gender = myInfoProperties.getGender() == null ? "MALE" : myInfoProperties.getGender();
        String address = myInfoProperties.getAddress();

        MyInfoConfig myInfoConfig = new MyInfoConfig();
        myInfoConfig.put(NAME, name);
        if (age != null){
            myInfoConfig.put(AGE, age);
        }
        myInfoConfig.put(GENDER, gender);
        if (address != null){
            myInfoConfig.put(ADDRESS, address);
        }
        return myInfoConfig;
    }
}
