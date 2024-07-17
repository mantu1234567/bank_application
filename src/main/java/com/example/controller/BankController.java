package com.example.controller;

import com.example.entity.BankBranch;
import com.example.service.BankService;
import com.example.service.impl.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {

  @Autowired BankService bankService;

  @PostMapping("/addBranch")
  public void addBankBranch(@RequestBody List<BankBranch> bankBranches) {
    bankService.addBankBranch(bankBranches);
  }

  @GetMapping("/allBranch")
  public ModelAndView getAllBranch() {
    List<BankBranch> branches = bankService.getBranch();
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("branches", branches);
    modelAndView.setViewName("branch.html");
    return modelAndView;
  }

  @GetMapping("/branch/{id}")
  public ModelAndView getBranchById(@PathVariable Long id) {
    ModelAndView modelAndView = new ModelAndView();
    BankBranch branch = bankService.getBranchById(id);
    modelAndView.addObject("branch", branch);
    modelAndView.setViewName("branch-details.html");
    return modelAndView;
  }
}
