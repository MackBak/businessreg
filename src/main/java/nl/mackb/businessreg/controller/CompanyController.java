package nl.mackb.businessreg.controller;

import nl.mackb.businessreg.models.Company;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createCompany(
            @RequestBody Company company) {

        companyService.saveCompany(company);
        System.out.println("###- - - ###\nCompany created:\n" + company + "\n");
        return ResponseEntity.ok().build();
    }

}
