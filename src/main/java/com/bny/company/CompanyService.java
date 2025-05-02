package com.bny.company;

import java.util.List;

public interface CompanyService {
    boolean deleteCompanyById(Long id);

    List<Company> findAllCompany();

    void createCompany(Company company);

    boolean updateCompany(Company company, Long id);


    Company getCompanyById(Long id);
}
