lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.halega",
      scalaVersion := "2.13.7"
    )),
    name := "prog-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
