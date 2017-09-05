package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;

@Entity
@Table (name = "addressbook")
public class ContactData {
  @Id
  @Column(name = "id")
  private int id = Integer.MAX_VALUE;
  @Expose
  @Column(name = "firstname")
  private String имя;
  @Expose
  @Column(name = "lastname")
  private String фамилия;
  @Expose
  @Transient
  private String group;
  @Column(name = "home")
  @Type(type = "text")
  private String homePhone;
  @Column(name = "mobile")
  @Type(type = "text")
  private String mobilePhone;
  @Column(name = "work")
  @Type(type = "text")
  private String workPhone;

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", имя='" + имя + '\'' +
            ", фамилия='" + фамилия + '\'' +
            '}';
  }

  @Expose
  @Transient
  private String allPhones;
  @Expose
  @Transient
  private String mail;
  @Transient
  private String mail2;
  @Transient
  private String mail3;
  @Transient
  private String allMails;
  @Expose
  @Type(type = "text")
  private String address;
  @Column(name = "photo")
  @Type(type = "text")
  private String photo;

  public File getPhoto() {
    return new File(photo);
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo.getPath();
    return this;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (имя != null ? !имя.equals(that.имя) : that.имя != null) return false;
    return фамилия != null ? фамилия.equals(that.фамилия) : that.фамилия == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (имя != null ? имя.hashCode() : 0);
    result = 31 * result + (фамилия != null ? фамилия.hashCode() : 0);
    return result;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public String getMail() {
    return mail;
  }

  public ContactData withMail(String mail) {
    this.mail = mail;
    return this;
  }

  public String getMail2() {
    return mail2;
  }

  public ContactData withMail2(String mail2) {
    this.mail2 = mail2;
    return this;
  }

  public String getMail3() {
    return mail3;
  }

  public ContactData withMail3(String mail3) {
    this.mail3 = mail3;
    return this;
  }

  public String getAllMails() {
    return allMails;
  }

  public ContactData withAllMails(String allMails) {
    this.allMails = allMails;
    return this;
  }


  public String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public ContactData withHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public ContactData withMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  public ContactData withName(String имя) {
    this.имя = имя;
    return this;
  }

  public ContactData withLastname(String фамилия) {
    this.фамилия = фамилия;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  public ContactData withId(int id) {

    this.id = id;
    return this;
  }

  public int getId() {
    return id;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getИмя() {
    return имя;
  }

  public String getФамилия() {
    return фамилия;
  }

  public String getGroup() {
    return group;
  }

}
