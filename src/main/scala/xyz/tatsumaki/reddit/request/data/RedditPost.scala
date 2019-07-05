package xyz.tatsumaki.reddit.request.data

case class RedditPost(
                       subreddit: String,
                       author: String,
                       url: String,
                       id: String,
                       selftext: String
                     ) {
  override def equals(other: Any): Boolean = other match {
    case post: RedditPost => post.id == id
    case _ => false
  }
}
