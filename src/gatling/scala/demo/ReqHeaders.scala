package demo


object ReqHeaders {

  def getRequestHeader(): Map[String, String] = {
    Map("Content-Type" -> "application/json")

  }
}