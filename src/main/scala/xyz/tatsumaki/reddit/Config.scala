package xyz.tatsumaki.reddit

class Config(
              val port: Int = 0,
              val keys: Array[String] = Array(),
              val fdbPort: Int = 0,
              val pathToFdbCluster: String = ""
            )
