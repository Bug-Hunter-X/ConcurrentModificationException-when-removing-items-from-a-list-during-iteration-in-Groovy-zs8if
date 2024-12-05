```groovy
def myMethod(List<String> list) {
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    println "Item: $item"
    if (item == "target") {
      iterator.remove()
    }
  }
}

List<String> myList = ["one", "target", "two", "target", "three"]
myMethod(myList)
println myList

//Alternative solution creating a new list
def myMethod2(List<String> list) {
  List<String> newList = []
  list.each { item ->
    println "Item: $item"
    if (item != "target") {
      newList << item
    }
  }
  return newList
}

myList = ["one", "target", "two", "target", "three"]
myList = myMethod2(myList) 
println myList
```