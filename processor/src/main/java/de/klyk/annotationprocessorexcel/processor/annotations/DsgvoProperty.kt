package de.klyk.annotationprocessorexcel.processor.annotations

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
annotation class DsgvoProperty(
    val verwendungszweckProperty: Array<Verwendungszweck>
)

data class DsgvoPropertyData(
    val name: String,
    val verwendungszweck: List<String>
)