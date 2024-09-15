package battery;

import enums.BatteryEnum;

public class GetBattery implements Battery {
    @Override
    public String getBattery(BatteryEnum batteryEnum) {
        if(batteryEnum.equals(BatteryEnum.THREE_THOUSAND)) {
            System.out.println("Battery: " + BatteryEnum.THREE_THOUSAND.name());
            return BatteryEnum.THREE_THOUSAND.name();
        } else if(batteryEnum.equals(BatteryEnum.FOUR_THOUSAND)) {
            System.out.println("Battery: " + BatteryEnum.FOUR_THOUSAND.name());
            return BatteryEnum.FOUR_THOUSAND.name();
        }
        return "Battery not found";
    }
}
