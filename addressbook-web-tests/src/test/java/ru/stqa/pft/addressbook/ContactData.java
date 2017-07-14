package ru.stqa.pft.addressbook;

public class ContactData {
  private final String имя;
  private final String отчество;
  private final String фамилия;
  private final String ник;
  private final String адрес;
  private final String телефон;
  private final String почта;

  public ContactData(String Имя, String Отчество, String Фамилия, String Ник, String Адрес, String Телефон, String Почта) {
    имя = Имя;
    отчество = Отчество;
    фамилия = Фамилия;
    ник = Ник;
    адрес = Адрес;
    телефон = Телефон;
    почта = Почта;
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
}
