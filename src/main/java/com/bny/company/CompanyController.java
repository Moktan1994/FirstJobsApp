package com.bny.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        return ResponseEntity.ok(companyService.findAllCompany());
    }

    @PostMapping
    public ResponseEntity<String> createCompanies(@RequestBody Company company) {
        companyService.createCompanies(company);
        return new ResponseEntity<>("Company created successfully", HttpStatus.CREATED);
    }

}
