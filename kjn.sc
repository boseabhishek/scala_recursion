
val evenInts = for (n <- 1 to 1000) yield n

evenInts filter (_ % 10 == 4)