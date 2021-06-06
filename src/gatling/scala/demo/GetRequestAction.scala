

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


object GetRequestAction {
  
  def getRequestAction() ={
  
  exec(http("getRequest")
        .get("/posts")
        .headers(ReqHeaders.getRequestHeader())
        .check(status.in(200 to 310)))
  }
  
}