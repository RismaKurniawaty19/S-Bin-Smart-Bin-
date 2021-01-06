package Bin;

public interface BinState {
    void insertRubbish(int newBinVolume, String newRubbishType);

    void turnServo(String newRubbishType);
}
