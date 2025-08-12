package br.com.dio.dto;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString

public class UserDTO {
  private int id;
  private String name;
  private LocalDate birthday;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

// Getter e Setter para name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

// Getter e Setter para birthday
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}