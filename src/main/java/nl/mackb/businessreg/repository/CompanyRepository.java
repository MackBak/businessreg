package nl.mackb.businessreg.repository;

import nl.mackb.businessreg.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
