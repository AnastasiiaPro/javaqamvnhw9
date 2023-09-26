package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCurrentNumberStation() {
        Radio radio =  new Radio();
        radio.setCurrentNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMaxNumberStation() {
        Radio radio =  new Radio();

        radio.setToMaxNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToMinNumberStation() {
        Radio radio =  new Radio();

        radio.setToMinNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMaxNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMinNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(0);
        radio.increaseNumberStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(0);
        radio.decreaseNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(9);
        radio.increaseNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        Radio radio =  new Radio();

        radio.setCurrentNumberStation(2);
        radio.decreaseNumberStation();

        int expected = 1;
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
    public void shouldNotMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}


