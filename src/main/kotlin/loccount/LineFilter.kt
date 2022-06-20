package loccount

class LineFilter {

    companion object {

        fun filterCommentsAndEmptyLines(lines: List<String>): List<String> {
            return lines.filter { !it.isSingleLineComment() && !it.isEmptyLine() }
        }

        private fun String.isSingleLineComment(): Boolean {
            return this.trim().take(2) == "//"
        }

        private fun String.isEmptyLine(): Boolean {
            return this.isBlank()
        }
    }
}