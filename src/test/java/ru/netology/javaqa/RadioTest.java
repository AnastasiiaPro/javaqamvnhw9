package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldCountStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10, radio.getCountStation());
        Assertions.assertEquals(0, radio.getMinNumberStation());
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldCurrentNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMaxNumberStation() {
        Radio radio = new Radio();

        radio.setToMaxNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMinNumberStation() {
        Radio radio = new Radio();

        radio.setToMinNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMaxNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMinNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationLowBoundary() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.nextNumberStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationLowBoundaryMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);
        radio.nextNumberStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationUpBoundaryMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);
        radio.nextNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationLowBoundary() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.prevNumberStation();

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationLowBoundaryMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);
        radio.prevNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationUpBoundaryMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);
        radio.prevNumberStation();
        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMaxVolumeBoundaryMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMinVolumeBoundaryMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLowBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLowBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpBoundaryMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUpBoundaryMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLowBoundaryMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowBoundaryMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}