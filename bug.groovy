```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "target") {
      list.remove(item) //This is the problematic line
    }
  }
}

List<String> myList = ["one", "target", "two", "target", "three"]
myMethod(myList)
```