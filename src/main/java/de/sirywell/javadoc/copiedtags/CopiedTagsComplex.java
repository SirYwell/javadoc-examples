package de.sirywell.javadoc.copiedtags;

import java.io.IOException;

public class CopiedTagsComplex implements CopyableTags {

  // the @return tag is copied from the interface
  /**
   * A doc without return tag.
   */
  @Override
  public int copyReturn() {
    return 0;
  }

  // the @param tag is copied from the interface
  /**
   * A doc without param tag.
   */
  @Override
  public void copyParam(int i) {
  }

  // the @param i tag is copied from the interface
  /**
   * A doc with partial param tags.
   * @param j the second value, but documented in the subclass.
   */
  @Override
  public void copyParamMultiple(int i, int j) {
  }

  // the @throws tag is copied from the interface
  /**
   * A doc without throws tag.
   */
  @Override
  public void copyThrows() throws IOException {
  }

  // the @throws IOException tag is copied from the interface
  /**
   * A doc with partial throws tags.
   * @throws ReflectiveOperationException because reflection is bad.
   */
  @Override
  public void copyThrowsMultiple() throws IOException, ReflectiveOperationException {
  }

  // the @throws tag from the interface is not copied
  /**
   * A doc without throws tag and without declared exceptions.
   */
  @Override
  public void doNotCopyNotDeclaredThrows() {
  }
}
