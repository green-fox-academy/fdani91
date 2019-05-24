package com.greenfox.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    this.foxes = new ArrayList<>();
  }

  public void addIfValid(String name) throws Exception {
    if (foxes.stream().anyMatch(f -> f.getName().equals(name))) {
      throw new Exception("Fox already exists!");
    }
    Fox fox = new Fox(name, "pizza", "beer");
    foxes.add(fox);
  }

  public Fox getCurrentFox(String fox) {
      Optional<Fox> storedFox = foxes.stream()
              .filter(f -> f.getName().equals(fox))
              .findFirst();

      return storedFox.get();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }
}
