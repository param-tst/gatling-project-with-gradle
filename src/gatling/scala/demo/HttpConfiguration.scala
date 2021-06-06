package demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._




object HttpConfiguration {
  
  val _currentProjectURI = System.getProperty("currentProjectURI", "https://jsonplaceholder.typicode.com") 
   val _employeesURI = System.getProperty("employeesURI", "http://dummy.restapiexample.com") 
 
  
 
  
  private val _httpConfCurrent= http
      .baseUrl(_currentProjectURI)
      
      private val _httpConfEmployees= http
      .baseUrl(_employeesURI)
      
  
  def httpConfCurrent=_httpConfCurrent
   def httpConfEmployees=_httpConfEmployees
  
}
