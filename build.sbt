import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "rip.suiiii"
ThisBuild / organizationName := "jswrapper"

lazy val root = (project in file("."))
  .settings(
  )
  .aggregate(jswrapper.js, jswrapper.jvm)


lazy val jswrapper = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  settings(
    name := "jswrapper",
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
    scalaJSUseMainModuleInitializer := true,
    npmDependencies in Compile += "jquery" -> "3.5.0",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
  )
  .enablePlugins(ScalaJSBundlerPlugin)