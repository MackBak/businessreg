package nl.mackb.businessreg.controller;

import nl.mackb.businessreg.models.Company;
import nl.mackb.businessreg.repository.CompanyRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void saveCompany(Company company) {
        companyRepository.save(company);
    }

    public ResponseEntity<Company> getCompanyByName(String name) {
        return companyRepository.findByName(name)
                .map(company -> ResponseEntity.ok(company))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Company> getCompanyByCompanyId(Long id) {
        return companyRepository.findByCompanyId(id)
                .map(company -> ResponseEntity.ok(company))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Company> getCompanyByCompanyType(String companyType) {
        return companyRepository.findByCompanyType(companyType)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
