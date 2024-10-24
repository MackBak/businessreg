package nl.mackb.businessreg.config;

import nl.mackb.businessreg.models.Company;
import nl.mackb.businessreg.repository.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer {

    @Bean
    public CommandLineRunner initDatabase(CompanyRepository companyRepository) {
        return args -> {
            // Create and save the first company in the DB
            Company firstCompany = new Company();
            firstCompany.setName("James Corp");
            firstCompany.setOwner("Lebron James");
            firstCompany.setAddress("Superstraat 200, Utrecht");
            firstCompany.setDescription("Basketball company");
            firstCompany.setEmail("lebron@james.com");
            firstCompany.setCompanyType("bv");
            firstCompany.setStartDate(LocalDate.of(2024, 10, 24));

            companyRepository.save(firstCompany);
            System.out.println("# # # # # # # # # # # # # # # # # # #\nFirst company created:\n" + firstCompany + "\n# # # # # # # # # # # # # # # # # # #\n");
        };
    }
}
