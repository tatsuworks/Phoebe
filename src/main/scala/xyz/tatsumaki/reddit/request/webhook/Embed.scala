package xyz.tatsumaki.reddit.request.webhook

case class Embed(
                  title: String = null,
                  description: String = null,
                  url: String = null,
                  timestamp: String = null,
                  color: Int = 0,
                  footer: EmbedFooter = null,
                  image: EmbedImage = null,
                  thumbnail: EmbedImage = null,
                  author: EmbedAuthor = null,
                  fields: Array[EmbedField] = Array()
                )

case class EmbedFooter(text: String, icon_url: String = null)
case class EmbedAuthor(name: String, url: String = null, icon_url: String = null)
case class EmbedImage(url: String)
case class EmbedField(name: String, value: String, inline: Boolean)