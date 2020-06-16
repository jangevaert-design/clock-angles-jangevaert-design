package edu.cnm.deepdive;


public class ClockAngles {

  ClockAngles() {

  }
//Basic task

  public static double hourHandDegrees(int hours, double minutes) {
    if (hours >= 0) {
      hours = hours % 12;

    } else {
      hours = (hours % 12) + 12;
    }
    return (hours * 30) + (minutes * 0.5);
  }


  public static double minuteHandDegrees(double minutes) {
    if (minutes > 60) {
      minutes = minutes - 60;
    }
    if (minutes == 60) {
      minutes = 0;
    }
    return Math.abs(minutes) * 6;
  }
}




