class ArrayMunitTests extends munit.FunSuite {
  test("Arrays equality") {
    assertEquals(Seq(1, 2).sorted, Seq(2, 1).sorted)
  }
}
