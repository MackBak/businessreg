package nl.mackb.businessreg.repository;

import nl.mackb.businessreg.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByName(String name);

    Optional<Company> findByCompanyId(Long companyId);

    Optional<Company> findByCompanyType(String companyType);
}
