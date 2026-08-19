package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {

  private final ResourceBundle bundle;

  private ConfigurationSingleton() {
    this.bundle = ResourceBundle.getBundle("config");
  }

  private static class SingletonHolder {
    private static final ConfigurationSingleton instance = new ConfigurationSingleton();
  }

  public static ConfigurationSingleton getInstance() {
    return SingletonHolder.instance;
  }

  public String getProperty(String cle) {
    return bundle.getString(cle);
  }
}
