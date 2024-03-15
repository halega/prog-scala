lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.halega",
      scalaVersion := "2.13.13"
    )),
    name := "prog-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test
libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M11" % Test
