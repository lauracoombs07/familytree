package com.family.tree.models

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "families")
data class Families (
    @Id
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var familyId: UUID = UUID.fromString("8180eda9-bf97-4106-b170-f7c4a2d08f10"),
    var familyName: String = "Egbert",
    var familyDescription: String = "Blah",
    var familyDateFrom: LocalDate = LocalDate.parse("2020-09-15")
)