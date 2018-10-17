package org.fundacionjala;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
  private static final Logger log = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    FileHandler file;
    log.setUseParentHandlers(false);
    log.setLevel(Level.FINER);
    log.fine("Begin my app. --");
    log.entering(Main.class.getName(), "Do it. --");
    System.out.println("Hello Logger");
    try {
      file = new FileHandler("C:/temp/my-log-file.log", true);
      log.addHandler(file);
      SimpleFormatter formatter = new SimpleFormatter();
      file.setFormatter(formatter);
      log.info("Hey we are going.");
    } catch (Exception e) {
      log.warning("File cannot be created.");
    }
    log.info("The app show 'Hello Logger'");
    log.exiting(Main.class.getName(), "Do it.");
  }
}
