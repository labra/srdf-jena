import sbt._
import sbt.Keys._

lazy val root = project.in(file("."))

organization := "es.weso"

name := "srdf-jena"

version := "0.0.3"

scalaVersion := "2.11.8"

publishMavenStyle := true

libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-compiler" % scalaVersion.value 
  , "org.apache.jena" % "jena-arq" % "2.13.0"
  , "junit" % "junit" % "4.10" % "test"
  , "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  , "org.rogach" %% "scallop" % "0.9.5"
  , "es.weso" % "srdf-jvm_2.11" % "0.0.7"
  , "es.weso" % "turtleparser-jvm_2.11" % "0.0.5"
  )

autoCompilerPlugins := true

// scalariformSettings

bintrayRepository in bintray := "weso-releases"

bintrayOrganization in bintray := Some("weso")

licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0"))

resolvers += Resolver.bintrayRepo("labra", "maven")

resolvers += Resolver.bintrayRepo("weso", "weso-releases")

