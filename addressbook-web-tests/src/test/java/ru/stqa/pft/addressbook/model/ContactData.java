package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id = Integer.MAX_VALUE;
  private String имя;
  private String фамилия;
  private String group;
  private String homePhone;
  private String mobilePhone;
  private String workPhone;
  private String allPhones;
  private String mail;
  private String mail2;
  private String mail3;
  private String allMails;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (имя != null ? !имя.equals(that.имя) : that.имя != null) return false;
    return фамилия != null ? фамилия.equals(that.фамилия) : that.фамилия == null;
  }

  @Override
  public int hashCode() {
    int result = имя != null ? имя.hashCode() : 0;
    result = 31 * result + (фамилия != null ? фамилия.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", имя='" + имя + '\'' +

            ", фамилия='" + фамилия + '\'' +
            ", group='" + group + '\'' +
            '}';

  }

}
