package edu.cnm.deepdive;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/* "C:\Program Files\Java\jdk11.0.7_10\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\lib\idea_rt.jar=56410:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\lib\idea_rt.jar;C:\Users\Owner\.m2\repository\org\junit\platform\junit-platform-launcher\1.6.2\junit-platform-launcher-1.6.2.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\plugins\junit\lib\junit-rt.jar;C:\Users\Owner\Desktop\bootcamp\projects\clock-angles-jangevaert-design\out\test\clock-angles;C:\Users\Owner\Desktop\bootcamp\projects\clock-angles-jangevaert-design\out\production\clock-angles;C:\Users\Owner\.m2\repository\org\junit\jupiter\junit-jupiter\5.6.2\junit-jupiter-5.6.2.jar;C:\Users\Owner\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.6.2\junit-jupiter-api-5.6.2.jar;C:\Users\Owner\.m2\repository\org\apiguardian\apiguardian-api\1.1.0\apiguardian-api-1.1.0.jar;C:\Users\Owner\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\Owner\.m2\repository\org\junit\platform\junit-platform-commons\1.6.2\junit-platform-commons-1.6.2.jar;C:\Users\Owner\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.6.2\junit-jupiter-params-5.6.2.jar;C:\Users\Owner\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.6.2\junit-jupiter-engine-5.6.2.jar;C:\Users\Owner\.m2\repository\org\junit\platform\junit-platform-engine\1.6.2\junit-platform-engine-1.6.2.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 "edu.cnm.deepdive.ClockAnglesTest,hourHandDegrees(int[])"
Internal Error occurred.
org.junit.platform.commons.JUnitException: TestEngine with ID 'junit-jupiter' failed to discover tests
	at org.junit.platform.launcher.core.DefaultLauncher.discoverEngineRoot(DefaultLauncher.java:189)
	at org.junit.platform.launcher.core.DefaultLauncher.discoverRoot(DefaultLauncher.java:168)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:132)
	at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)*/


class ClockAnglesTest {

  static final int[][] hourAngleParams = {
      {0, 0},
      {3, 15},
      {12, 30},
      {19,42},
      {36, 0},
      {2, 75},
      {13, -30},
      {-5, 42},
  };

  static final double[] hourAngleExpected = {0, 97.5, 15, 231, 0, 97.5, 15, 231};

  static final int[] minuteAngleExpected = {0, 90, 180, 252, 0, 90, 180, 252};

  @Test
  void hourHandDegrees() {
    ClockAnglesTest angles = new ClockAnglesTest();
    for (int i = 0; i < hourAngleParams.length; i++) {
      double actual = (long) ClockAngles.hourHandDegrees(hourAngleParams[i][0], hourAngleParams[i][1]);
      assertEquals(hourAngleExpected[i], actual);
    }
  }

    @Test
    void minuteHandDegrees() {
      ClockAnglesTest angles = new ClockAnglesTest();
      for (int i = 0; i < hourAngleParams.length; i++) {
        double actual = (long) ClockAngles.minuteHandDegrees(hourAngleParams[i][1]);
        assertEquals(minuteAngleExpected[i], actual);

      }
    }

}





