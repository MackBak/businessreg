package nl.mackb.businessreg.controller;

import nl.mackb.businessreg.models.Company;
import nl.mackb.businessreg.repository.CompanyRepository;
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
}
