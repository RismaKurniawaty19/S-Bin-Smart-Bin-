package Bin;

public class NoRubbish implements BinState {
    BinMachine binMachine;

    public NoRubbish(BinMachine newBinMachine) {
        binMachine = newBinMachine;
    }

    public void insertRubbish(int volumeBin, String rubbishType) {
        if (rubbishType.equalsIgnoreCase("organik")) {
            System.out.println("Silahkan masukkan sampah Anda");
            binMachine.setBinStateOrganic(binMachine.getWasteSegregationState());
        } else {
            System.out.println("Silahkan masukkan sampah Anda");
            binMachine.setBinStateAnorganic(binMachine.getWasteSegregationState());
        }
    }

    public void turnServo(String rubbishType) {
        System.out.println("Sampah tidak ada sehingga mode pemilahan sampah tidak tersedia...");
    }
}
