package xyz.tatsumaki.reddit

import com.google.gson.{Gson, JsonElement, JsonParser}

package object util {
  private val gson = new Gson()
  private val parser = new JsonParser()
  implicit class AnyExtensions(val any: AnyRef) extends AnyVal {
    def toJson: String = gson.toJson(any)
  }
  implicit class StringExtensions(val str: String) extends AnyVal {
    def fromJson[T](clazz: Class[T]): T = gson.fromJson(str, clazz)
    def toElement: JsonElement = parser.parse(str)
  }
}
