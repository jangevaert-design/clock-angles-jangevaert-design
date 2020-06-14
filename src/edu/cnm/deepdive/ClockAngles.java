package edu.cnm.deepdive;


public class ClockAngles {

  ClockAngles() {

  }


  public static double hourHandDegrees(int hours, double minutes) {

    if (hours < 0) {
      hours = hours + 24;
    }
    if (hours == 12) {
      hours = 0;

    }
    if (hours > 12) {
      hours = hours - 12;
    }
    return (hours * 30) + (minutes * 0.5);
  }

  public static double minuteHandDegrees(int minutes) {

    if (minutes > 60) {
      minutes = minutes - 60;
    }

    if (minutes == 60) {
      minutes = 0;
    }

    return Math.abs(minutes * 6);
  }

}
