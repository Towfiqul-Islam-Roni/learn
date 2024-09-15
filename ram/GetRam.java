package ram;

import enums.RamEnum;

public class GetRam implements Ram {
    public String getRam(RamEnum ramEnum) {
        if(RamEnum.FOUR_GB.equals(ramEnum)) {
            System.out.println("Ram: " + RamEnum.FOUR_GB.name());
            return RamEnum.FOUR_GB.name();
        } else if(RamEnum.EIGHT_GB.equals(ramEnum)) {
            System.out.println("Ram: " + RamEnum.EIGHT_GB.name());
            return RamEnum.EIGHT_GB.name();
        }
        return "Ram not found";
    }
    
}
