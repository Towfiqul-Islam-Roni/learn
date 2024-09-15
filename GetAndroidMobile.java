import factories.GetMobileData;
import mobile.AssembleAndroid;
import mobile.Mobile;
import userSatisfaction.AndroidSatisfaction;
import userSatisfaction.UserSatisfaction;

public class GetAndroidMobile implements GetMobileData {
    @Override
    public Mobile mobile() {
        return new AssembleAndroid();
    }

    @Override
    public UserSatisfaction userSatisfaction() {
        return new AndroidSatisfaction();
    }

}