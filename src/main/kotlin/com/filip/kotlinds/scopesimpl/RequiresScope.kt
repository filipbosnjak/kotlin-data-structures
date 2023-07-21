package com.filip.kotlinds.scopesimpl

/**
 * @Retention - meta annotation -> annotates other annotations
 * retention - marks when the annotation is discarded
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION) // Intended to annotate functions
annotation class RequiresScope(val scope: Scope)


enum class Scope(val scopeName: String) {
    WRITE("Write"),
    READ("Read")
}
