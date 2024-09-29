package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;


    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void louder() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 0;
    }

    public void quieter() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
        currentVolume = 100;
    }
}
