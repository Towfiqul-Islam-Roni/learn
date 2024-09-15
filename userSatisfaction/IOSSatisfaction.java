package userSatisfaction;

import enums.SatisfactionEnum;

public class IOSSatisfaction implements UserSatisfaction {
    @Override
    public SatisfactionEnum getUserSatisfaction() {
        System.out.println("User is okay with the mobile.");
            return SatisfactionEnum.OKAY;
    }
}
