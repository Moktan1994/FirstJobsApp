package com.bny.company.impl;

import com.bny.company.Company;
import com.bny.company.CompanyRepository;
import com.bny.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAllCompany() {
        return companyRepository.findAll();
    }

    @Override
    public void createCompanies(Company company) {
        companyRepository.save(company);
    }
}
