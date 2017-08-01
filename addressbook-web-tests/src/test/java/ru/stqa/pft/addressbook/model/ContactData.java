package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String имя;
  private final String фамилия;
  private final String адрес;
  private final String телефон;
  private final String почта;
  private String group;

  public ContactData(String Имя, String Фамилия,String Адрес, String Телефон, String Почта,String group) {
    this.имя = Имя;
    this.фамилия = Фамилия;
    this.адрес = Адрес;
    this.телефон = Телефон;
    this.почта = Почта;
    this.group = group;
  }

  public String getИмя() {
    return имя;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "имя='" + имя + '\'' +
            ", фамилия='" + фамилия + '\'' +
            ", адрес='" + адрес + '\'' +
            ", телефон='" + телефон + '\'' +
            ", почта='" + почта + '\'' +
            '}';
  }

  public String getФамилия() {
    return фамилия;
  }

  public String getАдрес() {
    return адрес;
  }

  public String getТелефон() {
    return телефон;
  }

  public String getПочта() {
    return почта;
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
