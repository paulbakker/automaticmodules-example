package com.javamodularity.demonstrator;

public class Book {
  private final String name;
  private final String description;

  public Book(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
