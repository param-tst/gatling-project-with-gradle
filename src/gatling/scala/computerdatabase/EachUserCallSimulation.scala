package computerdatabase

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import demo.GlobalVariables
import demo.QPSCalculator_Crit_High
import demo.WorkloadModel_Crit_High
import demo.GetRequestScenario
import demo.HttpConfiguration
import demo.GetEmployeesScenario



/**
 * Gatling simulation
 * @author Paramveer.Singh
 *
 */
class EachUserCallSimulation extends Simulation {

  before {

    println("\n------------------------------------------- Load Paramters-------------------------------------------\n\n")
    println(">>>>>>>>>>>>>>>>>>>>>>>>> rampDuration =" + GlobalVariables.rampDuration)
    println(">>>>>>>>>>>>>>>>>>>>>>>> totalduration =" + GlobalVariables.totalduration)

    println("\n------------------------------------------- QPS Details-------------------------------------------\n\n")
    println("\n>>>>>>>>>>>>>>>>>>>>>>>>>getRequest=" + QPSCalculator_Crit_High.GetRequestScn_qps)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>getRequestUsers =" + WorkloadModel_Crit_High.GetRequestScn_ramp )

   

  }
  /*  Gatling scenario user load setup */

  /**
   *  Created a Map to execute the scenario's individually to verify the scripts
   *  It works by passing the following argument as part of jvm arguments : "-DScenario=Scenario_Name"
   *  Eg: -DScenario=ValidateAuthenticationScenario
   */
  //***********************QPS************************************
  
  val GetRequestScn_qps = QPSCalculator_Crit_High.GetRequestScn_qps

  val GetRequestScn_ramp =  WorkloadModel_Crit_High.GetRequestScn_ramp


  val rampDuration = GlobalVariables.rampDuration
  val totalduration = GlobalVariables.totalduration
  val duration = totalduration
  
  val rampUsers=  rampConcurrentUsers(1).to(1).during(1.seconds)

  val httpScenarios = Map(

    "all" -> List(
        
    
        
         GetRequestScenario.getRequestScenario.inject(rampUsers).
                                                              
                                                                 protocols(HttpConfiguration.httpConfCurrent),
       GetEmployeesScenario.getEmployeesScenario.inject(rampUsers).
                                                                 protocols(HttpConfiguration.httpConfEmployees)
         
         
    ))
        
      
       
     
httpScenarios
  setUp(
    httpScenarios(System.getProperty("Scenario","all")): _*).throttle( reachRps(1).in(1.seconds),holdFor(40.seconds),reachRps(1).in(10.seconds))
  
  

}