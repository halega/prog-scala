object Prime {

  def isPrimeSimple(n: Integer): Boolean = {
    for (i <- 2 until n)
      if (n % i == 0) {
        return false
    }
    true
  }
}
