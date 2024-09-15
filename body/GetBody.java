package body;

import enums.BodyEnum;
import enums.MobileEnum;

public class GetBody implements Body{
    @Override
    public String getBody(MobileEnum mobile) {
        if(mobile.equals(MobileEnum.ANDROID)) {
            System.out.println("Body: " + BodyEnum.FOLD.name());
            return BodyEnum.FOLD.name();
        }
        System.out.println("Body: SAME_AS_ALL_PHONE");
        return BodyEnum.SAME_AS_ALL_PHONE.name();
    }
}
