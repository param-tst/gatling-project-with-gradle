package demo

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.core.structure.ChainBuilder



/**
 * Executes the scenario 
 * @author paramveer.singh
 * 
 */

object GetEmployeesScenario {
   
   val getEmployeesScenario = scenario("GetEmployeesScenario").forever(
      exec(GetEmployeesAction.getEmployeesAction())
   )
 
}