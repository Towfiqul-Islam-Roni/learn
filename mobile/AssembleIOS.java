package mobile;

import battery.Battery;
import battery.GetBattery;
import body.Body;
import body.GetBody;
import enums.BatteryEnum;
import enums.MobileEnum;
import enums.ProcessorEnum;
import enums.RamEnum;
import processor.GetProcessor;
import processor.Processor;
import ram.GetRam;
import ram.Ram;

public class AssembleIOS implements Mobile{
    @Override
    public void assembleMobile() {
        Processor processor = new GetProcessor();
        processor.getProcessor(ProcessorEnum.A_THIRTEEN);
        Ram ram = new GetRam();
        ram.getRam(RamEnum.EIGHT_GB);
        Battery battery = new GetBattery();
        battery.getBattery(BatteryEnum.FOUR_THOUSAND);
        Body body = new GetBody();
        body.getBody(MobileEnum.IOS);
        System.out.println("Apple iOS assembly done");
    }
}
