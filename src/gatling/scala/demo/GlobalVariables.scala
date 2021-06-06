package demo

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.core.structure.ChainBuilder

/**
 * Creates the Global Variabless
 * @author Paramveer.Singh
 */

object GlobalVariables {

  
 
  def  rampDuration = Integer.getInteger("rampduration", 100).toInt
  def totalduration = Integer.getInteger("totalduration", 100).toInt
  
  
  
  
}