package Bin;

public class EmptyRubbish implements BinState {
    BinMachine binMachine;

    public EmptyRubbish(BinMachine newBinMachine) {
        binMachine = newBinMachine;
    }

    public void insertRubbish(int volumeBin, String rubbishType) {

        if (rubbishType.equalsIgnoreCase("organik")) {
            System.out.println("Tong sampah telah diberishkan.... Tong sampah dalam kondisi kosong...");
            binMachine.setOrganicBinVolume(100);
            binMachine.setBinStateOrganic(binMachine.getNoRubbishState());
        } else {
            System.out.println("Tong sampah telah diberishkan.... Tong sampah dalam kondisi kosong...");
            binMachine.setAnorganicBinVolume(100);
            binMachine.setBinStateAnorganic(binMachine.getNoRubbishState());
        }
    }

    public void turnServo(String rubbishType) {
        System.out.println("Sampah tidak ada sehingga mode pemilahan sampah tidak tersedia...");
    }
}
