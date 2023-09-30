package ru.netology.javaqa;

public class Radio {
    private int countStation = 10;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int currentNumberStation = minNumberStation;

    public Radio() {
    }

    public Radio(int countStation) {
        maxNumberStation = minNumberStation + countStation - 1;

    }

    public int getCountStation() {
        return countStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < minNumberStation) {
            return;
        }
        if (newCurrentNumberStation > maxNumberStation) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }


    public void setToMaxNumberStation() {

        currentNumberStation = maxNumberStation;
    }

    public void setToMinNumberStation() {

        currentNumberStation = minNumberStation;
    }

    public void nextNumberStation() {

        if (currentNumberStation < maxNumberStation) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = minNumberStation;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = maxNumberStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {

        currentVolume = maxVolume;
    }

    public void setToMinVolume() {

        currentVolume = minVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}