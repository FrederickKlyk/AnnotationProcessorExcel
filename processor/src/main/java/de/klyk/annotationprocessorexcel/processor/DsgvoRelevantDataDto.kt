package de.klyk.annotationprocessorexcel.processor

/**
 * Data class to store the DSGVO information.
 */
data class DsgvoRelevantDataDto(
    var kategorie: List<String> = emptyList(),
    var verwendungszweck: List<String> = emptyList(),
    var land: String = "",
    var domaene: String = "",
    var system: String = "",
    var personenbezogeneDaten: String = "",
    var quellen: String = "",
    var kategorieVonEmpfaengern: List<String> = emptyList(),
    var drittland: Boolean = false,
    var bemerkungen: String = "",
    var optionaleTechnischeInformationen: String = ""
)