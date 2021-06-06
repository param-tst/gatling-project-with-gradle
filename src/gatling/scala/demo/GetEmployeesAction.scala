

package demo

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._



/**
 * 
 * @author paramveer.singh
 *
 */


object GetEmployeesAction {
  
  def getEmployeesAction() ={
  
  exec(http("getEmployees")
        .get("api/v1/employees")
        .headers(ReqHeaders.getRequestHeader())
        .check(status.in(200 to 310)))
  }
  
}