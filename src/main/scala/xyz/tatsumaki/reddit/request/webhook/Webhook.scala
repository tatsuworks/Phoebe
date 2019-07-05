package xyz.tatsumaki.reddit.request.webhook

import com.google.gson.JsonElement
import scalaj.http.Http
import xyz.tatsumaki.reddit.util.StringExtensions

class Webhook(val url: String) {

  import xyz.tatsumaki.reddit.util.AnyExtensions

  def send(message: Message): JsonElement = {
    val req = Http(url).postData(message.toJson)
    req.asString.body.toElement
  }


}
