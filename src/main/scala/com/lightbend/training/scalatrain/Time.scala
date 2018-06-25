package com.lightbend.training.scalatrain

object Time {

  private val minutesPerHours : Int = 60
  private val hoursPerDay : Int = 24

  def fromMinutes(minutes: Int) : Time = {
    new Time(minutes / minutesPerHours, minutes % minutesPerHours)
  }

}

case class Time(hours:Int = 0, minutes:Int = 0) {

  //Error control
  require(hours >= 0 && hours < Time.hoursPerDay, "The hours should be between 0 and 23")
  require(minutes >=0 && minutes < Time.minutesPerHours, "The minutes should be between 0 and 59")

  def asMinutes : Int = (hours * Time.minutesPerHours) + minutes

  def minus(other: Time) : Int = this.asMinutes - other.asMinutes

  def -(other: Time) : Int = this.minus(other)

}


