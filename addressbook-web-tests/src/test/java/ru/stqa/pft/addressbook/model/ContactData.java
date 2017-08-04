package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id =Integer.MAX_VALUE;
  private String имя;
  private String фамилия;
  private String group;

  public int getId() {
    return id;
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

  public String getИмя() {
    return имя;
  }

  public String getФамилия() {
    return фамилия;
  }

  public String getGroup() { return group; }

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
