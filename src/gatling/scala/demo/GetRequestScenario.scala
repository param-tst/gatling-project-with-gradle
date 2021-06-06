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

object GetRequestScenario {
   
   val getRequestScenario = scenario("GetRequestScenario").forever(
      exec(GetRequestAction.getRequestAction())
   )
 
}