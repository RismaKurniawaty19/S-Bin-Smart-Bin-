package Bin;

public class HasRubbish implements BinState {
    BinMachine binMachine;

    public HasRubbish(BinMachine newBinMachine) {
        binMachine = newBinMachine;
    }

    public void insertRubbish(int binVolume, String rubbishType) {
        if (rubbishType.equalsIgnoreCase("organik")) {
            if (binMachine.getOrganicBinVolume() >= binVolume) {
                binMachine.setOrganicBinVolume(binMachine.getOrganicBinVolume() - binVolume);
                if (binMachine.getOrganicBinVolume() == 0) {
                    ;
                    binMachine.setBinStateOrganic(binMachine.getFullRubbishState());
                } else {
                    binMachine.setBinStateOrganic(binMachine.getNoRubbishState());
                }
                System.out.println("Sampah telah masuk, volume tong sampah organik sekarang adalah "
                        + binMachine.getOrganicBinVolume());
            } else {
                System.out.println("kebanyakan sampahnya broo...");
                binMachine.setBinStateOrganic(binMachine.getNoRubbishState());
            }

        } else {
            if (binMachine.getAnorganicBinVolume() >= binVolume) {
                binMachine.setAnorganicBinVolume(binMachine.getAnorganicBinVolume() - binVolume);
                if (binMachine.getAnorganicBinVolume() == 0) {
                    ;
                    binMachine.setBinStateAnorganic(binMachine.getFullRubbishState());
                } else {
                    binMachine.setBinStateAnorganic(binMachine.getNoRubbishState());
                }
                System.out.println("Sampah telah masuk, volume tong sampah anorganik sekarang adalah "
                        + binMachine.getAnorganicBinVolume());
            } else {
                System.out.println("kebannyakan sampahnya broo...");
                binMachine.setBinStateAnorganic(binMachine.getNoRubbishState());
            }
        }

    }

    public void turnServo(String rubbishType) {
    }

}
