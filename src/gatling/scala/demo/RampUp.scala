package demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


object RampUp {

  val _rampUsersPerGivenSecs = Integer.getInteger("rampUsersPerGivenSecs",3).toInt
  val _stepTime = Integer.getInteger("steptime", 1).toInt
  val _rampUsersInSim = Integer.getInteger("rampUsersInSim", 3).toInt
  
  def rampUsersPerGivenSecs=_rampUsersPerGivenSecs
  def stepTime=_stepTime
  def rampUsersInSim=_rampUsersInSim
  
}