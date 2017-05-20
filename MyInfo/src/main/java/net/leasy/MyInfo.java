package net.leasy;

import static net.leasy.MyInfoConfigKey.*;

/**
 * Created by leasy on 17/5/18.
 */
public class MyInfo {

    private MyInfoConfig myInfoConfig;

    public MyInfo(MyInfoConfig myInfoConfig) {
        this.myInfoConfig = myInfoConfig;
    }

    public String print() {
        String name = myInfoConfig.getProperty(NAME);
        String age = myInfoConfig.getProperty(AGE);
        String gender = myInfoConfig.getProperty(GENDER);
        String address = myInfoConfig.getProperty(ADDRESS);

        StringBuilder builder = new StringBuilder();
        String nameInfo = String.format("This is %s %s", gender.equalsIgnoreCase("male") ? "MR" : "MS", name);
        builder.append(nameInfo);
        if (age != null) {
            builder.append(String.format(", I'm %s years old", age));
        }
        if (address != null) {
            builder.append(String.format("and I lived in %s now.", address));
        }
        return builder.toString();
    }
}
