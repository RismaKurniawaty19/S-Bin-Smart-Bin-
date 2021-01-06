package Bin;

public class BinMachine {
    BinState noRubbish;
    BinState hasRubbish;
    BinState wasteSegregation;
    BinState fullRubbish;
    BinState emptyRubbish;

    BinState binStateOrganic;
    BinState binStateAnorganic;

    int organicBinVolume = 100;
    int anorganicBinVolume = 100;
    String rubbishType = "organik";

    public BinMachine() {
        noRubbish = new NoRubbish(this);
        hasRubbish = new HasRubbish(this);
        wasteSegregation = new WasteSegregation(this);
        fullRubbish = new FullRubbish(this);
        emptyRubbish = new EmptyRubbish(this);

        binStateOrganic = noRubbish;
        binStateAnorganic = noRubbish;

        // if(binVolume < 0)
        // {
        // binState = hasRubbish;
        // }

    }

    public void setBinStateOrganic(BinState newBinState) {
        binStateOrganic = newBinState;
    }

    public void setBinStateAnorganic(BinState newBinState) {
        binStateAnorganic = newBinState;
    }

    /**
     * public void setBinVolume(int binVolume) { binVolume = newBinVolume; }
     */

    public void setOrganicBinVolume(int newOrganicBinVolume) {
        organicBinVolume = newOrganicBinVolume;
    }

    public void setAnorganicBinVolume(int newAnorganicBinVolume) {
        anorganicBinVolume = newAnorganicBinVolume;
    }

    public void setRubbishType(String newRubbishType) {
        rubbishType = newRubbishType;
    }

    public void insertRubbish(int newBinVolume, String newRubbishType) {
        if (rubbishType.equalsIgnoreCase(newRubbishType)) {
            binStateOrganic.insertRubbish(newBinVolume, newRubbishType);
        } else {
            binStateAnorganic.insertRubbish(newBinVolume, newRubbishType);
        }

    }

    public void turnServo(String newRubbishType) {
        if (rubbishType.equalsIgnoreCase(newRubbishType)) {
            binStateOrganic.turnServo(newRubbishType);
        } else {
            binStateAnorganic.turnServo(newRubbishType);
        }
    }

    public BinState getNoRubbishState() {
        return noRubbish;
    }

    public BinState getHasRubbishState() {
        return hasRubbish;
    }

    public BinState getWasteSegregationState() {
        return wasteSegregation;
    }

    public BinState getFullRubbishState() {
        return fullRubbish;
    }

    public BinState getEmptyRubbish() {
        return emptyRubbish;
    }

    public int getOrganicBinVolume() {
        return this.organicBinVolume;
    }

    public int getAnorganicBinVolume() {
        return this.anorganicBinVolume;
    }
}
