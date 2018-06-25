package com.lightbend.training.scalatrain

class Train(val schedule: Seq[(Time, Station)]) {

  require(schedule.size >= 2)
  private val stations : Seq[Station] = schedule.map(timeAndStation => timeAndStation._2)

  //TODO Verify that schedule is strictly increasing in time

}
