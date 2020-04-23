package jswrapper

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport.Namespace

import org.scalajs.dom.document

object JsWrapperMain {

  def main(args: Array[String]): Unit = {
    println("Hello World")
    println(jquery)

    val something = jquery("*", "", "")
    println(s"something == $something")
  }

  @js.native
  @JSImport("jquery", Namespace)
  object jquery extends Jquery

  @js.native
  trait Jquery extends js.Function3[String, String, String, js.Object] {
    def apply(selector: String, a: String, b: String): js.Object = js.native
  }
}
