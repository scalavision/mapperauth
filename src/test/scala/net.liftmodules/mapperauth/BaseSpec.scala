package net.liftmodules.mapperauth

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

import net.liftweb._
import common._
import http._
import util._
import Helpers._

trait BaseSpec extends WordSpec with ShouldMatchers
trait MapperBaseSpec extends BaseSpec with MapperTestKit

trait WithSessionSpec extends BaseSpec {
  def session = new LiftSession("", randomString(20), Empty)

  override protected def withFixture(test: NoArgTest) = {
    S.initIfUninitted(session) { test() }
  }
  
}
