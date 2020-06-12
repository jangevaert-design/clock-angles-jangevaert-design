---
title: Clock Angles 
description: "Angular positions of the hour & minute hands of a clock"
layout: default
---

## Value

* Basic implementation: 10 points
* Basic unit tests: 5 points
* Extra credit implementation: 5 points
* Extra credit unit tests: 5 points

## Basic task

In this task, you will complete the implementation of and test a method to compute the angles to which the hands of a clock will be oriented at a given time of day.

### Implementation

The `edu.cnm.deepdive.ClockAngles` class contains 2 methods which must be completed to compute the angles formed by the minute and hour hands (each measured clockwise from 12 o'clock) of a clock at a specified time of day. The table below shows the signature, return types, and intended functionality of these methods; both use the `public` and `static` modifiers.

| Return type | Signature | Intended functionality |
|:-----------:|:---------:|:----------------------:|
| `double` | `hourHandDegrees(int hours, double minutes)` | Computes and returns the angle made by the hour hand, measured in degrees clockwise from vertical (12:00), in the interval [0, 360). |
| `double` | `minuteHandDegrees(double minutes)` | Computes and returns the angle made by the minute hand, measured in degrees clockwise from vertical (12:00), in the interval [0, 360). |

For more method declaration details, see the [Javadoc documentation](api/edu/cnm/deepdive/ClockAngles.html#method.detail).

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs:

| `hours` | `minutes` | Expected return value of `hourHandDegrees( hours, minutes)` | Expected return value of `minuteHandDegrees( minutes)` |
|:-------:|:---------:|:----------------------------------:|:-----------------------------:|
| `0` | `0` | `0` | `0` |
| `3` | `15` | `97.5` | `90` |
| `12` | `30` | `15` | `180` |
| `19` | `42` | `231` | `252` |
 
In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Assumptions

* The value of the `hours` parameter will always be in the range 0 to 23, inclusive. (Note that your code shouldn't care whether a 12-hour or 24-hour clock is being used.)

* The value of the `minutes` parameter will always be in the real-valued interval [0, 60)&mdash;that is a floating-point number ranging from 0 (inclusive) to 60 (exclusive).

* The angle of the minute hand doesn't depend at all on the hours; however, the angle of the hour hand depends on both the hours and the minutes, since the hour hand on the clock face advances even as the minutes advance.

* Since non-integral computations are almost always inexact, results need only be accurate to within 0.01&deg;.

### Hints

* The methods to be completed are `static`; there is no need to create instances of `ClockAngles` (and arguably no benefit in doing so).

* You may find it useful to create one or more additional `static` methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The methods to be completed include `TODO` comments to that effect.    

## Extra credit

### Implementation

Modify your implementations to relax &amp; normalize the hour and minute values given by the corresponding parameters of all of the methods. That is, the bounds should be eliminated from the first two [assumptions (above)](#assumptions). With this change, we need not assume that the `minutes` parameter will always be in the interval [0, 60); instead, we should allow a value of (for instance) 80, and treat that as 1:20 (1 hour, 20 minutes). Similarly, a value of -15 for `minutes` can be treated as -1 hour (i.e. subtracting 1 from `hours`), plus 45 minutes.

### Unit tests 

For unit testing credit on the extra credit portion of the problem, use JUnit5 to verify your code with the following inputs and expected outputs:

| `hours` | `minutes` | Expected return value of `hourHandDegrees( hours, minutes)` | Expected return value of `minuteHandDegrees( minutes)` |
|:-------:|:---------:|:----------------------------------:|:-----------------------------:|
| `36` | `0` | `0` | `0` |
| `2` | `75` | `97.5` | `90` |
| `13` | `-30` | `15` | `180` |
| `-5` | `42` | `231` | `252` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* You may find it useful to create one or more additional `static` methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.
