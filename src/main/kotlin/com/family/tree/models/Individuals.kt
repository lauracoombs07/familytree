package com.family.tree.models

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
data class Individuals (
        @Id
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        var primaryId: UUID = UUID.fromString("ce3c9d55-dd73-4be6-80dc-77705ee14277"),
        var firstName: String = "John",
        var lastName: String = "Smith",
        var gender: String = "Male",
        var dateOfBirth: LocalDate = LocalDate.parse("1980-01-03"),
        var placeOfBirth: String = "Germany"
)