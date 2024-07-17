package com.example.service.impl;

import com.example.entity.BankBranch;
import com.example.repository.BankBranchRepository;
import com.example.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

  @Autowired BankBranchRepository bankBranchRepository;

  @Override
  public void addBankBranch(List<BankBranch> bankBranches) {
    bankBranchRepository.saveAll(bankBranches);
  }

  @Override
  public List<BankBranch> getBranch() {
    return bankBranchRepository.findAll();
  }

  @Override
  public BankBranch getBranchById(Long id) {
    return bankBranchRepository.findById(id).orElseThrow();
  }
}
