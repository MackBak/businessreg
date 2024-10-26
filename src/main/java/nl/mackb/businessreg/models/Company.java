package nl.mackb.businessreg.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Company {
    private final int MAX_GENERAL_CHARS = 45;
    private final int MAX_ADDRESS_CHARS = 100;
    private final int MAX_DESCRIPTION_CHARS = 150;
    private final int MAX_EMAIL_CHARS = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long companyId;

    @Column(length = MAX_GENERAL_CHARS, nullable = false)
    private String name;

    @Column(length = MAX_GENERAL_CHARS, nullable = false)
    private String owner;

    @Column(length = MAX_ADDRESS_CHARS, nullable = false)
    private String address;

    @Column(length = MAX_DESCRIPTION_CHARS, nullable = false)
    private String description;

    @Column(length = MAX_EMAIL_CHARS, nullable = false)
    private String email;

    @Column(length = MAX_GENERAL_CHARS, nullable = false)
    private String companyType;

    private LocalDate startDate;

}
