scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  /// SET A
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "io.kamon"       %% "kamon-bundle"   % "2.0.2",
//  "io.kamon"       % "kanela-agent"    % "1.0.1",
//  "com.propensive" %% "mercator"       % "0.2.1"
  /// SET A2
//  "ch.qos.logback"    % "logback-classic"  % "1.2.3",
//  "io.kamon"          %% "kamon-core"      % "2.0.1",
//  "io.kamon"          % "kanela-agent"     % "1.0.1",
//  "com.typesafe.akka" %% "akka-http"       % "10.1.9",
//  "de.heikoseeberger" %% "akka-http-circe" % "1.28.0",
//  "io.kamon"          %% "kamon-jaeger"    % "2.0.0",
//  "com.propensive"    %% "mercator"        % "0.2.1"
  //// SET B
//  "com.typesafe.akka"    %% "akka-http"               % "10.1.9",
//  "ch.qos.logback"       % "logback-classic"          % "1.2.3",
////  "net.logstash.logback" % "logstash-logback-encoder" % "5.3",
////  "com.propensive"       %% "magnolia"                % "0.12.0", //exclude("com.propensive", "mercator"),
//  "com.propensive"       %% "mercator"                % "0.2.1",
//  "de.heikoseeberger"    %% "akka-http-circe"         % "1.28.0",
//  "io.kamon"             %% "kamon-jaeger"            % "2.0.0",
//  "io.kamon"             %% "kamon-prometheus"        % "2.0.0",
//  "io.circe"             %% "circe-core"              % "0.12.1",
//  "io.kamon"             %% "kamon-bundle"            % "2.0.2",
//  "io.kamon"             % "kanela-agent"             % "1.0.1"
)

fork := true
