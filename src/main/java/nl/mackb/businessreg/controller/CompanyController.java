package nl.mackb.businessreg.controller;

import nl.mackb.businessreg.models.Company;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/create")
    public ResponseEntity<Company> createCompany(
            @RequestBody Company company) {

        companyService.saveCompany(company);
        System.out.println("###- - - ###\nCompany created:\n" + company + "\n");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<Company> getCompany(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "companyType", required = false) String companyType) {

        if (name != null) {
            return companyService.getCompanyByName(name);
        } if (id != null) {
            return companyService.getCompanyByCompanyId(id);
        } if (companyType != null) {
            return companyService.getCompanyByCompanyType(companyType);
        } else {
            System.out.println("## NO COMPANY FOUND! ##");
            return null;
        }

    }

}
