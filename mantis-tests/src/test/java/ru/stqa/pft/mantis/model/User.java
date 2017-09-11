package ru.stqa.pft.mantis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mantis_user_table")
public class User {

  @Id
  @Column(name="id")
  private int id;

  @Column(name="username")
  private String name;

  @Column(name="email")
  private String email;

  public User withId(int id) {
    this.id = id;
    return this;
  }

  public User withName(String name) {
    this.name = name;
    return this;
  }

  public User withEmail(String email) {
    this.email = email;
    return this;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }


  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }

}