// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
// Luka Kamidzorac id- 201914015

fun redact(document: String, text: String, redactionChar: Char = 'X'): String =
    document.replace(text, redactionChar.toString().repeat(text.length))
