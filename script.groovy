def buildApp(String a)
{
  echo "Building the application"
  echo a
}


def myscript(String something, Closure x) {
   x()
  buildApp(something)
}

return this

