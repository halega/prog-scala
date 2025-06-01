lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.halega",
      scalaVersion := "2.13.16"
    )),
    name := "prog-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
libraryDependencies += "org.scalameta" %% "munit" % "1.1.1" % Test
