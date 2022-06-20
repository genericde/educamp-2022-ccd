package loccount

import printer.Printer


class LocCount(private val printer: Printer) {

    operator fun invoke(fileName: String) {
        val allLines = FileReader.readLines(fileName)
        val validLines = LineFilter.filterCommentsAndEmptyLines(allLines)
        val lineCount = LineCounter.count(validLines)
        printer.print("Line count: $lineCount")
    }
}