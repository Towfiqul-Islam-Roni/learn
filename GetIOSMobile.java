import factories.GetMobileData;
import mobile.AssembleIOS;
import mobile.Mobile;
import userSatisfaction.IOSSatisfaction;
import userSatisfaction.UserSatisfaction;

public class GetIOSMobile implements GetMobileData {
    @Override
    public Mobile mobile() {
        return new AssembleIOS();
    }

    @Override
    public UserSatisfaction userSatisfaction() {
        return new IOSSatisfaction();
    }
    
}
