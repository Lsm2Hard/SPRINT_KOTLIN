fun main() {
  var hoursDepart = 9
  var minDepart = 39
  var minWay = 457

  var sumMinute = minWay + minDepart
  println(sumMinute)
  var transMinInHours = sumMinute / 60
  println(transMinInHours)
  var searchLastMin = transMinInHours * 60
  println(searchLastMin)



  var hoursWay = transMinInHours + hoursDepart
  print(hoursWay)
  print(":")
  var lastMin = sumMinute - searchLastMin
  print(lastMin)

  var timeWay = sumMinute - minDepart - lastMin






}