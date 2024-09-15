import factories.GetMobileData;
import mobile.AssembleFeaturePhone;
import mobile.Mobile;
import userSatisfaction.GetHimAFeaturePhone;
import userSatisfaction.UserSatisfaction;

public class GetFeaturePhone implements GetMobileData {
    @Override
    public Mobile mobile() {
        return new AssembleFeaturePhone();
    }

    @Override
    public UserSatisfaction userSatisfaction() {
        return new GetHimAFeaturePhone();
    }
    
}
