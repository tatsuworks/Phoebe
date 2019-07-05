
name := "Phoebe"

version := "0.1"

scalaVersion := "2.13.0"
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.2",
  "com.google.code.gson" % "gson" % "1.7.1",
  "com.github.pathikrit" %% "better-files" % "3.8.0",
  "com.github.xaanit" % "Scalalin" % "db1a80d"
)

mainClass in assembly := Some("xyz.tatsumaki.reddit.Main")
assemblyJarName in assembly := "RedditFeed.jar"
assemblyMergeStrategy in assembly := {
  case PathList("org", "eclipse", "jetty", "http", "encoding.properties") => MergeStrategy.first
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
