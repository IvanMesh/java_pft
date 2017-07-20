package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String имя;
  private final String отчество;
  private final String фамилия;
  private final String ник;
  private final String адрес;
  private final String телефон;
  private final String почта;
  private String group;

  public ContactData(String Имя, String Отчество, String Фамилия, String Ник, String Адрес, String Телефон, String Почта,String group) {
    this.имя = Имя;
    this.отчество = Отчество;
    this.фамилия = Фамилия;
    this.ник = Ник;
    this.адрес = Адрес;
    this.телефон = Телефон;
    this.почта = Почта;
    this.group = group;
  }

  public String getИмя() {
    return имя;
  }

  public String getОтчество() {
    return отчество;
  }

  public String getФамилия() {
    return фамилия;
  }

  public String getНик() {
    return ник;
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
}
