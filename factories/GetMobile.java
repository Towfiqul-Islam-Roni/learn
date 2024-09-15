package factories;
import enums.MobileEnum;
import mobile.AssembleAndroid;
import mobile.AssembleIOS;
import mobile.AssembleFeaturePhone;
import mobile.Mobile;

public class GetMobile {
    public Mobile getMobile(MobileEnum mobile) {
        if (mobile.equals(MobileEnum.ANDROID)) {
            return new AssembleAndroid();
        }
        if (mobile.equals(MobileEnum.IOS)) {
            return new AssembleIOS();
        }
        return new AssembleFeaturePhone();
    }
}
