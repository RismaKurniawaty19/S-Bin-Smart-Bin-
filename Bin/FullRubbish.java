package Bin;

public class FullRubbish implements BinState {
    BinMachine binMachine;

    public FullRubbish(BinMachine newBinMachine) {
        binMachine = newBinMachine;
    }

    public void insertRubbish(int volumeBin, String rubbishType) {
        if (rubbishType.equalsIgnoreCase("organik")) {
            binMachine.setBinStateOrganic(binMachine.getEmptyRubbish());
            System.out.println("Tong sampah penuh! ... Tidak bisa memasukkan sampah");
        } else {
            binMachine.setBinStateAnorganic(binMachine.getEmptyRubbish());
            System.out.println("Tong sampah penuh! ... Tidak bisa memasukkan sampah");
        }
    }

    public void turnServo(String rubbishType) {
        System.out.println("Tong sampah penuh!");
    }
}
