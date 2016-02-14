package net.minecrell.gradle.licenser

import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.util.PatternSet

class LicenseExtension extends PatternSet {

    File header

    boolean newLine = true

    Collection<SourceSet> sourceSets

    String charset = 'UTF-8'

    boolean ignoreFailures = false

}