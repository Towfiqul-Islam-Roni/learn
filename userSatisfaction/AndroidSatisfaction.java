package userSatisfaction;

import enums.SatisfactionEnum;

public class AndroidSatisfaction implements UserSatisfaction {
    @Override
    public SatisfactionEnum getUserSatisfaction() {
        System.out.println("User is satisfied with the mobile.");
            return SatisfactionEnum.SATISFIED;
    }
    
}
