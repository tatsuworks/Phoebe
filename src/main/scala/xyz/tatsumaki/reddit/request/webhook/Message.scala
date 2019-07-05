package xyz.tatsumaki.reddit.request.webhook

case class Message(
                    content: String = null,
                    username: String = null,
                    avatar_url: String = null,
                    tts: Boolean = false,
                    embeds: Array[Embed] = Array()
                  )