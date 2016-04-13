scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-log4j12" % "1.6.1",
  "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.0",
  "junit" % "junit" % "4.8.1" % "test",
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"
)
