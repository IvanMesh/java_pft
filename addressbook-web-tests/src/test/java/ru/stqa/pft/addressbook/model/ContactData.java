package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id;
  private String имя;
  private String фамилия;
  private String адрес;
  private String телефон;
  private String почта;
  private String group;

  public ContactData(String Имя, String Фамилия, String Адрес, String Телефон, String Почта, String group) {
    this.id = Integer.MAX_VALUE;
    this.имя = Имя;
    this.фамилия = Фамилия;
    this.адрес = Адрес;

    this.телефон = Телефон;
    this.почта = Почта;
    this.group = group;

  }

  public ContactData(int id, String Имя, String Фамилия, String Адрес, String Телефон, String Почта, String group) {
    this.id = id;
    this.имя = Имя;
    this.фамилия = Фамилия;
    this.адрес = Адрес;
    this.телефон = Телефон;
    this.почта = Почта;
    this.group = group;
  }

  public int withId() {
    return id;
  }

  public String withName() {
    return имя;
  }

  public String withLastName() {
    return фамилия;
  }

  public String withAddress() {
    return адрес;
  }

  public String withPhone() {
    return телефон;
  }

  public String withMail() {
    return почта;
  }

  public String withGroup() { return group; }

  public void withId(int id) {

    this.id = id;
  }

  public void setИмя(String имя) {
    this.имя = имя;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +

            ", имя='" + имя + '\'' +
            ", фамилия='" + фамилия + '\'' +
            ", адрес='" + адрес + '\'' +
            ", телефон='" + телефон + '\'' +
            ", почта='" + почта + '\'' +
            '}';

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (имя != null ? !имя.equals(that.имя) : that.имя != null) return false;
    if (фамилия != null ? !фамилия.equals(that.фамилия) : that.фамилия != null) return false;
    if (адрес != null ? !адрес.equals(that.адрес) : that.адрес != null) return false;
    if (телефон != null ? !телефон.equals(that.телефон) : that.телефон != null) return false;
    return почта != null ? почта.equals(that.почта) : that.почта == null;
  }

  @Override
  public int hashCode() {
    int result = имя != null ? имя.hashCode() : 0;
    result = 31 * result + (фамилия != null ? фамилия.hashCode() : 0);
    result = 31 * result + (адрес != null ? адрес.hashCode() : 0);
    result = 31 * result + (телефон != null ? телефон.hashCode() : 0);
    result = 31 * result + (почта != null ? почта.hashCode() : 0);
    return result;
  }

}
