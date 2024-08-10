import jakarta.persistence.*
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate


@Entity
@Table(name="Books")
@EntityListeners(AuditingEntityListener::class)
class Book {

    @Id
    @Column(
        nullable = false,
        updatable = false
    )
    @SequenceGenerator(
        name = "primary_sequence",
        sequenceName = "primary_sequence",
        allocationSize = 1,
        initialValue = 1000
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "primary_sequence"
    )
    var id: Long? = null

    @Column(nullable = false)
    var name: String? = null

    @Column
    var pages: Int? = null

    @Column
    var publishedDate: LocalDate? = null

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var status: Status? = null
}