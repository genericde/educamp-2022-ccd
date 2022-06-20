package printer

class ConsolePrinter : Printer {

    override fun print(message: String) {
        println(message)
    }
}