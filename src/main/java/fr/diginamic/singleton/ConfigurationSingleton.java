package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {

  private static final ConfigurationSingleton instance = new ConfigurationSingleton();

  private final ResourceBundle bundle;

  private ConfigurationSingleton() {
    this.bundle = ResourceBundle.getBundle("config");
  }

  public static ConfigurationSingleton getInstance() {
    return instance;
  }

  public String getProperty(String cle) {
    return bundle.getString(cle);
  }
}
