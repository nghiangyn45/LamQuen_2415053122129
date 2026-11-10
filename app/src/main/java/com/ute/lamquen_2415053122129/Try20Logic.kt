package com.ute.lamquen_2415053122129

object Try20Logic {
    fun tenHopLe(raw: String): String? {
        val trimmed = raw.trim()
        return if (trimmed.isEmpty()) null else trimmed
    }

    fun docSoLuong(raw: String): Int? {
        val trimmed = raw.trim()
        val num = trimmed.toIntOrNull() ?: return null
        return if (num in 1..9) num else null
    }

    fun loiChao(ten: String, soLuong: Int): String {
        return "Xin chào $ten, số lượng: $soLuong"
    }
}