package loccount

import java.io.File

class FileReader {

    companion object {
        fun readLines(fileName: String): List<String> {
            return File(fileName).readLines()
        }
    }
}