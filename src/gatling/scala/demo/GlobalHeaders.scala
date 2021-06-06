package demo


object GlobalHeaders {
  
  
  
  def getGlobalHeaders(): Map[String, String] = {
    
            Map("X-Client-UserAgent" -> "Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0)",
                 "X-Client-IP" -> "127.0.0.1"
                )
        }
  
  
        
}