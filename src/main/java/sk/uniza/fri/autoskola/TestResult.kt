package sk.uniza.fri.autoskola

import java.time.LocalDateTime
import java.util.Date

class TestResult(points: Int, outOf: Int, date: LocalDateTime, successful: Boolean = true) {
    private var _points: Int = points;
    private var _outOf: Int = outOf;
    private var _date: LocalDateTime = date;
    private var _successful: Boolean = successful;

    val points get() = _points;
    val outOf get() = _outOf;
    val date get() = _date;
    val successful get() = _successful;
}