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

public class AssembleAndroid implements Mobile{
    @Override
    public void assembleMobile() {
        Processor processor = new GetProcessor();
        processor.getProcessor(ProcessorEnum.A_TWELVE);
        Ram ram = new GetRam();
        ram.getRam(RamEnum.FOUR_GB);

        
        Battery battery = new GetBattery();
        battery.getBattery(BatteryEnum.THREE_THOUSAND);
        Body body = new GetBody();
        body.getBody(MobileEnum.ANDROID);
        System.out.println("Android assembly done");
    }
}
