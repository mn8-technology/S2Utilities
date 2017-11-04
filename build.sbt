name := "S2Utilites"

version := "0.1"

scalaVersion := "2.12.4"

// Testing framework
libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.+" % "test"

// Geometry objects
libraryDependencies += "com.vividsolutions" % "jts" % "1.13"

// S2 core library (on maven - fork of original Google lib)
libraryDependencies += "io.sgr" % "s2-geometry-library-java" % "1.0.0"
