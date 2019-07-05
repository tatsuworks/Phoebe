package xyz.tatsumaki.reddit

import better.files.File
import io.javalin.Javalin
import it.xaan.scalalin.rest.Route
import xyz.tatsumaki.reddit.rest.endpoints.Ping
import xyz.tatsumaki.reddit.util._

object Main {

  def main(args: Array[String]): Unit = {
    val cfgFile = File("./config.json")
    if (!cfgFile.exists) {
      cfgFile.createFile()
      println("Please fill in the file.")
      cfgFile.write(new Config().toJson)
      System.exit(0)
    }

    val config = cfgFile.lines.mkString.fromJson(classOf[Config])

    val app = Javalin.create { cfg =>
      cfg.defaultContentType = "application/json"
      cfg.prefer405over404 = true
    }.routes(Route.getEndpoints[Config](Seq(
      new Ping(config)
    )))
      .start(config.port)
  }


}
