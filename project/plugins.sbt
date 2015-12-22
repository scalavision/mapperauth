resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "sbt-plugin-releases2" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("org.netbeans.nbsbt" % "nbsbt-plugin" % "1.1.4")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")
