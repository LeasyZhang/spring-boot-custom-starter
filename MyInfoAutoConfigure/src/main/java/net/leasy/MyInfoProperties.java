package net.leasy;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by leasy on 17/5/19.
 */
@ConfigurationProperties(prefix = "person.info")
public class MyInfoProperties {

    private String name;
    private String age;
    private String gender;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
