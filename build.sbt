sbtPlugin := true

name := "sbt-dustjs"

organization := "eu.getintheloop"

version := "0.0.6-SNAPSHOT"

libraryDependencies += "rhino" % "js" % "1.7R2"

scalacOptions += "-deprecation"

publishArtifact in (Compile, packageBin) := true

publishArtifact in (Test, packageBin) := false

publishArtifact in (Compile, packageDoc) := false

publishArtifact in (Compile, packageSrc) := false

// sbt test framework
seq(ScriptedPlugin.scriptedSettings: _*)

// disable the buffer for scripted
// so that the output shows in the console
scriptedBufferLog := false