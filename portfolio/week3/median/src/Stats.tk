fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Cannot compute the median of an empty list" }
    val sorted = values.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[mid]
    } else {
        (sorted[mid - 1] + sorted[mid]) / 2
    }
}
