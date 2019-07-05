package xyz.tatsumaki.reddit.rest.endpoints

import io.javalin.http.Context
import it.xaan.scalalin.rest.Route
import xyz.tatsumaki.reddit.Config

class Ping(val config: Config) extends Route[Config](path = "/ping", custom = config) {
  override def get(ctx: Context): Unit = respond(code = 200, json = Map("message" -> "Pong!"))(ctx)
}
