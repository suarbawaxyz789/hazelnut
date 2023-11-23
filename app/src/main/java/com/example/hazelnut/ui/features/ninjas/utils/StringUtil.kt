package com.example.hazelnut.ui.features.ninjas.utils

import java.text.NumberFormat
import java.util.Locale

object StringUtil {

    @JvmStatic
    fun trimNewLineAndSpaces(message: String): String {
        val removePattern = Regex("(( )*(\n)( )*)+")
        val replacePattern = " "
        return message.replace(removePattern, replacePattern)
    }

    fun getFormattedAmountInLong(amount: Long): String =
        NumberFormat.getNumberInstance(Locale.US).format(amount)

    fun getFormattedAmountInInt(amount: Int): String =
        NumberFormat.getNumberInstance(Locale.US).format(amount)

    fun getFormattedAmountInDouble(amount: Double): String =
        NumberFormat.getNumberInstance(Locale.US).format(amount)
}