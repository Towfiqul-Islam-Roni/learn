import factories.GetMobileData;
import mobile.Mobile;
import userSatisfaction.UserSatisfaction;

public class Main {
    public static void main(String[] args) {

        // FOR SIMPLE FACTORY

        // System.out.println("\n");
        // GetMobile getMobile = new GetMobile();
        // Mobile mobileA = getMobile.getMobile(MobileEnum.ANDROID);
        // mobileA.assembleMobile();
        // System.out.println("\n");
        // Mobile mobileB = getMobile.getMobile(MobileEnum.IOS);
        // mobileB.assembleMobile();
        // System.out.println("\n");
        // Mobile mobileC = getMobile.getMobile(MobileEnum.NONE);
        // mobileC.assembleMobile();

        //FOR ABSTRACT FACTORY
        
        System.out.println("\n");
        GetMobileData getAndroidData = new GetAndroidMobile();
        Mobile mobileAndroid = getAndroidData.mobile();
        UserSatisfaction userSatisfactionAndroid = getAndroidData.userSatisfaction();
        mobileAndroid.assembleMobile();
        userSatisfactionAndroid.getUserSatisfaction();

        System.out.println("\n");
        GetMobileData getIOSData = new GetIOSMobile();
        Mobile mobileIOS = getIOSData.mobile();
        UserSatisfaction userSatisfactionIOS = getIOSData.userSatisfaction();
        mobileIOS.assembleMobile();
        userSatisfactionIOS.getUserSatisfaction();

        System.out.println("\n");
        GetMobileData getNoneData = new GetFeaturePhone();
        Mobile mobileNone = getNoneData.mobile();
        UserSatisfaction userSatisfactionNone = getNoneData.userSatisfaction();
        mobileNone.assembleMobile();
        userSatisfactionNone.getUserSatisfaction();
    }
}
