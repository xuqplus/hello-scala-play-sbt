name := """hello-scala-play-sbt"""
organization := "com.github.xuqplus"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.4"

libraryDependencies += guice

// https://mvnrepository.com/artifact/com.google.code.gson/gson
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.6"

// https://mvnrepository.com/artifact/org.scalatest/scalatest
// libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test

// https://mvnrepository.com/artifact/org.scalatestplus.play/scalatestplus-play
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
