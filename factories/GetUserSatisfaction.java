package factories;
import enums.MobileEnum;
import userSatisfaction.AndroidSatisfaction;
import userSatisfaction.GetHimAFeaturePhone;
import userSatisfaction.IOSSatisfaction;
import userSatisfaction.UserSatisfaction;

public class GetUserSatisfaction {
    public UserSatisfaction getUserSatisfaction(MobileEnum mobile) {
        if (mobile.equals(MobileEnum.ANDROID)) {
            return new AndroidSatisfaction();
        }
        if (mobile.equals(MobileEnum.IOS)) {
            return new IOSSatisfaction();
        }
        return new GetHimAFeaturePhone();
    }
}