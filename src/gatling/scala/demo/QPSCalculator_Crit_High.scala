package demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object QPSCalculator_Crit_High {

  //Total Number of Users
  private val _totalqps = Integer.getInteger("totalqps", 100).toInt

  //**********************************RampUp parameters**********************************
  
  

  //**********************************Percent qps**********************************
  
  
  private val _getRequestScn_qps_percent =100
  
  
 

  
  def GetRequestScn_qps = (math ceil (_getRequestScn_qps_percent * _totalqps / 100)).intValue()
 
 

  //**********************************User Percent**********************************   

 
  //Getters rampUp settings

 
  def totalqps=_totalqps
  

}