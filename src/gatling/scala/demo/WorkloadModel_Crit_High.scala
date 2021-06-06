package demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object WorkloadModel_Crit_High {

  //Total Number of Users
  private val _totalusers = Integer.getInteger("totalusers", 100).toInt

  //**********************************RampUp parameters**********************************
  //RampUp details 
  private val rampuserspergivensecs = RampUp.rampUsersPerGivenSecs
  private val steptime = RampUp.stepTime
  private val rampUserssim = RampUp.rampUsersInSim

  //**********************************Percent Users**********************************
  //Users in Percent
  //Ping
  private val _getRequestScn_users_percent =100
 
  
  
   

 //*************************************************Calculation
 
  
  private val _getRequestScn_users = (math ceil (_getRequestScn_users_percent * _totalusers / 100)).intValue()
 
  

  //**********************************User Percent**********************************   

  //**********************************RampUp**********************************

  //rampUp settings
  
  
 
       
  def GetRequestScn_ramp = constantConcurrentUsers(_getRequestScn_users).during(steptime.seconds)
  def totalusers_ramp = constantConcurrentUsers(_totalusers).during(steptime.seconds)
 

  def totalusers = _totalusers
  

 
  
}