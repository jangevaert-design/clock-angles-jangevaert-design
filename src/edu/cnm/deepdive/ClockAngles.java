/*
 *  Copyright 2020 Deep Dive Coding/CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive;

/**
 * This class contains stubs of the {@link #hourHandDegrees(int, double)} and {@link
 * #minuteHandDegrees(double)} methods. Implementation of these methods is included in the practical
 * exam problems of the Deep Dive Coding Java + Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class ClockAngles {

  private ClockAngles() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Computes and returns the angle made by the hour hand, measured in degrees
   * clockwise from straight up (12 o'clock on the clock face), in the interval
   * [0, 360).
   *
   * @param hours   hour component of time, in {0, 1, &hellip;, 23}.
   * @param minutes minute component of time, in [0&ndash;60).
   * @return        angle (in degrees) to which hour hand is oriented.
   */
  public static double hourHandDegrees(int hours, double minutes) {
    double hourDegrees = 0;
    hourDegrees = (hours * 30);
    return hourDegrees;
  }

  /**
   * Computes and returns the angle made by the minute hand, measured in degrees
   * clockwise from straight up (12 o'clock on the clock face), in the interval
   * [0, 360).
   *
   * @param minutes minute component of time, in [0&ndash;60).
   * @return        angle (in degrees) to which minute hand is oriented.
   */
  public static double minuteHandDegrees(double minutes) {
    double minuteDegrees = 0;
    minuteDegrees = (minutes * 0.5);
    return minuteDegrees;// TODO Replace this line with implementation.
  }

}
