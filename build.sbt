name := """minimal-akka-java-seed"""

version := "1.0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.11",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.11" % "test",
  "com.typesafe.conductr" %% "akka23-conductr-bundle-lib" % "1.0.1",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test")
  
lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging)

BundleKeys.endpoints := Map("akka-remote" -> Endpoint("tcp", 2551, Set.empty))

import ByteConversions._

BundleKeys.nrOfCpus := 1.0

BundleKeys.memory := 256.MiB

BundleKeys.diskSpace := 50.MiB

BundleKeys.roles := Set("akka")

fork in run := true

