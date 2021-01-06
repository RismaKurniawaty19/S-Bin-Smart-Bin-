package Bin;

public class WasteSegregation implements BinState {
    BinMachine binMachine;

    public WasteSegregation(BinMachine newBinMachine) {
        binMachine = newBinMachine;
    }

    public void insertRubbish(int binVolume, String rubbishType) {
        /*
         * if(rubbishType.equalsIgnoreCase("organik")) {
         * System.out.println("Sampah sebesar " + binVolume + " dengan jenis " +
         * binMachine.rubbishType + " telah masuk ke dalam prose pemilahan"); } else {
         * System.out.println("Sampah sebesar " + binVolume + " dengan jenis " +
         * binMachine.rubbishType + " telah masuk ke dalam prose pemilahan"); }
         */
    }

    public void turnServo(String rubbishType) {
        if (rubbishType.equalsIgnoreCase("organik")) {
            System.out.println("Turn Left");
            System.out.println("Sampah organik sedang dimasukkan ke dalam tempat sampah");
            binMachine.setBinStateOrganic(binMachine.getHasRubbishState());
        } else {
            System.out.println("Turn Right");
            System.out.println("Sampah anorganik sedang dimasukkan ke dalam tempat sampah");
            binMachine.setBinStateAnorganic(binMachine.getHasRubbishState());
        }
    }

}
