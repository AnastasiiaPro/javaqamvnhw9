package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0) {
            return;
        }
        if (newCurrentNumberStation > 9) {
            return;

        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void setToMaxNumberStation() {

        currentNumberStation = 9;
    }

    public void setToMinNumberStation() {

        currentNumberStation = 0;
    }

    public void increaseNumberStation() {

        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation +1;
        }
        if (currentNumberStation == 9) {
            currentNumberStation = 0;
        }
    }

    public void decreaseNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        }
        if (currentNumberStation == 0) {
            currentNumberStation = 9;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;

        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {

        currentVolume = 100;
    }

    public void setToMinVolume() {

        currentVolume = 0;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

