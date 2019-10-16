scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "ch.qos.logback"    % "logback-classic"   % "1.2.3",
  "io.kamon"          %% "kamon-bundle"     % "2.0.2",
  "com.typesafe.akka" %% "akka-http"        % "10.1.9",
  "de.heikoseeberger" %% "akka-http-circe"  % "1.28.0",
  // included to show that it's not just mysterious greyed-out instrumentation that actually works --  curls to
  // http://localhost:8080/hi do not show up on http://0.0.0.0:9095/ when scala-compiler is included, but do when it's not
  "io.kamon"          %% "kamon-prometheus" % "2.0.0",
  "org.scala-lang"    % "scala-compiler"    % scalaVersion.value // uncomment this and it works
)

fork := true
