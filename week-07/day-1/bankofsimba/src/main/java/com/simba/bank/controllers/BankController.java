package com.simba.bank.controllers;

import com.simba.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

  private List<BankAccount> bankAccountList = new ArrayList<>();
  private BankAccount simba = new BankAccount("Simba", 2000, "lion", true, true);
  private BankAccount zordon = new BankAccount("Zordon", 0, "lion", false, false);
  private BankAccount mufasa = new BankAccount("Mufasa", 500, "lion", true, true);
  private BankAccount pumba = new BankAccount("Pumba", 999, "boar", false, true);
  private BankAccount timon = new BankAccount("Timon", 660, "meerkat", false, true);

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("simba", simba);
    return "index";
  }

  @GetMapping("/htmlception")
  public String showHtmlCeption(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }

  @ModelAttribute
  public void setup(Model model) {
    bankAccountList.add(simba);
    simba.setKing(true);
    bankAccountList.add(zordon);
    bankAccountList.add(mufasa);
    mufasa.setKing(true);
    bankAccountList.add(pumba);
    bankAccountList.add(timon);
    model.addAttribute(bankAccountList);
  }

  @GetMapping("/all-account")
  public String showAllAccount() {
    return "all-account";
  }

  @GetMapping("/add")
  public String add(Model model, BankAccount account) {
    model.addAttribute("account",account);
    return "form";
  }

  @PostMapping("/post")
  public String raiseBalance() {
    for (BankAccount account : bankAccountList) {
      if (account.isKing()) {
        account.setBalance(account.getBalance() + 100);
      } else {
        account.setBalance(account.getBalance() + 10);
      }
    }
    return "redirect:/all-accounts";
  }
}
