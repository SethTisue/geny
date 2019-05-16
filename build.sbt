scalaVersion := "2.13.0-RC1"
organization := "com.lihaoyi"
name := "geny"
version := "0.1.5"
libraryDependencies += "com.lihaoyi" %% "utest" % "0.6.7" % "test"
testFrameworks := Seq(new TestFramework("utest.runner.Framework"))
Compile / unmanagedSourceDirectories += baseDirectory.value / "geny" / "src"
Test / unmanagedSourceDirectories += baseDirectory.value / "geny" / "test" / "src"
Compile / scalacOptions ++= Seq("-feature", "-deprecation", "-language:postfixOps")
