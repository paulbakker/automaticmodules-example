module demonstrator {
  requires jackson.databind;
  //requires jackson.core;
  //requires jackson.annotations;

  exports com.javamodularity.demonstrator to jackson.databind;
}
