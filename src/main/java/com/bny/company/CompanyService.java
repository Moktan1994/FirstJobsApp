package com.bny.company;

import java.util.List;

public interface CompanyService {
    List<Company> findAllCompany();

    void createCompanies(Company company);

    boolean updateCompany(Company company, Long id);
}
