package xyz.tatsumaki.reddit.rest

import it.xaan.scalalin.rest.RouteCheck.Check
import xyz.tatsumaki.reddit.{Config, UserError}

import scala.util._

object RouteCheck {
  val Authorization: Check[Config] = { (ctx, config) =>
    if (config.keys.contains(ctx.headerMap().getOrDefault("key", ""))) Success()
    else Failure(UserError(code = 401, json = Map("error" -> "Unauthorised.")))
  }
}
