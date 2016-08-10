package it.morfoza.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {

    private Company company;

    @Autowired
    public CompanyController(Company company) {
        this.company = company;
    }

    @RequestMapping("/")
    public String companyinfo(Model model) {
        model.addAttribute("company", company);
        return "companyinfo";
    }
}
