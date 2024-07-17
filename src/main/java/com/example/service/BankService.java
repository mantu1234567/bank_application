package com.example.service;

import com.example.entity.BankBranch;
import java.util.List;

public interface BankService {
  void addBankBranch(List<BankBranch> bankBranches);

  List<BankBranch> getBranch();
  BankBranch getBranchById(Long id);
}
