package de.sirywell.javadoc.copiedtags;

public class CopiedTagsDifferentParamName extends CopiedTagsComplex  {

  // the @param j tag is copied from the @param i tag in the interface
  /**
   * A doc comment without param tag and different param name.
   */
  @Override
  public void copyParam(int j) {
  }

  // switching the parameter names is allowed, the descriptions are copied by position
  /**
   * A doc comment without param tags and switched param names.
   */
  @Override
  public void copyParamMultiple(int j, int i) {
  }
}
