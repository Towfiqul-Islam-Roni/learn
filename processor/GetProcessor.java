package processor;

import enums.ProcessorEnum;

public class GetProcessor implements Processor {
    public String getProcessor(ProcessorEnum processorEnum) {
        if(processorEnum.equals(ProcessorEnum.A_TWELVE)){
            System.out.println("Processor: A_TWELVE");
            return ProcessorEnum.A_TWELVE.name();
        } else if(processorEnum.equals(ProcessorEnum.A_THIRTEEN)){
            System.out.println("Processor: A_THIRTEEN");
            return ProcessorEnum.A_THIRTEEN.name();
        }
        return "Processor not found";
    }
    
}
