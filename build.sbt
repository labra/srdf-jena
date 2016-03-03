import sbt._
import sbt.Keys._

lazy val root = project.in(file("."))

organization := "es.weso"

name := "srdf-jena"

version := "0.0.1"

scalaVersion := "2.11.7"

publishMavenStyle := true

libraryDependencies ++= Seq(
  , "org.scala-lang" % "scala-compiler" % scalaVersion.value 
  , "org.apache.jena" % "jena-arq" % "2.13.0"
  , "junit" % "junit" % "4.10" % "test"
  , "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  , "es.weso" % "srdf-jvm_2.11" % "0.0.4"
  )

autoCompilerPlugins := true

// scalariformSettings

bintrayRepository in bintray := "weso-releases"

bintrayOrganization in bintray := Some("weso")

licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0"))

resolvers += Resolver.bintrayRepo("labra", "maven")

resolvers += Resolver.bintrayRepo("weso", "weso-releases")

