package userSatisfaction;

import enums.SatisfactionEnum;

public class GetHimAFeaturePhone implements UserSatisfaction {
    @Override
    public SatisfactionEnum getUserSatisfaction() {
        System.out.println("He needs a feature phone.");
            return SatisfactionEnum.NONE;
    }

}
