package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ClockAnglesTest {

  static final int[][] hourAngleParams = {
      {0, 0},
      {3, 15},
      {12, 30},
      {19, 42}
  };

  static final double[] hourAngleExpected = {0, 97.5, 15, 231};


  @Test
  void hourHandDegrees() {
    ClockAnglesTest angles = new ClockAnglesTest();
    for (int i = 0; i < hourAngleParams.length; i++) {
      double actual = ClockAngles.hourHandDegrees(hourAngleParams[i][0], hourAngleParams[i][1]);
      assertEquals(hourAngleExpected[i], actual);
    }
  }

  static final int[] minuteAngleParams = {0, 15, 30, 42};

  static final int[] minuteAngleExpected = {0, 90, 180, 252};

  @Test
  void minuteHandDegrees() {
    ClockAnglesTest angles1 = new ClockAnglesTest();
    for (int i = 0; i < minuteAngleParams.length; i++) {
      double actual = ClockAngles.minuteHandDegrees(minuteAngleParams[i]);
      assertEquals(minuteAngleExpected[i], actual);

    }
  }


  static final int[][] hourAngleParamsEC = {
      {36, 0},
      {2, 75},
      {13, -30},
      {-5, 42}
  };


  static final double[] hourAngleExpectedEC = {0, 97.5, 15, 231};

  @Test
  void hourHandDegreesEC() {
    ClockAnglesTest angles2 = new ClockAnglesTest();
    for (int i = 0; i < hourAngleParamsEC.length; i++) {
      double actual = ClockAngles.hourHandDegrees(hourAngleParamsEC[i][0], hourAngleParamsEC[i][1]);
      assertEquals(hourAngleExpectedEC[i], actual);
    }
  }

  static final int[] minuteAngleParamsEC = {0, 75, -30, 42};


  static final int[] minuteAngleExpectedEC = {0, 90, 180, 252};

  @Test
  void minuteHandDegreesEC() {
    ClockAnglesTest angles3 = new ClockAnglesTest();
    for (int i = 0; i < minuteAngleParamsEC.length; i++) {
      double actual = ClockAngles.minuteHandDegrees(minuteAngleParamsEC[i]);
      assertEquals(minuteAngleExpectedEC[i], actual);

    }
  }
}





