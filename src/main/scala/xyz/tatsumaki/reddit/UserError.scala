package xyz.tatsumaki.reddit

case class UserError(
                      code: Int,
                      json: Map[String, Any] = Map(),
                      headers: Map[String, String] = Map()
                    ) extends RuntimeException()
