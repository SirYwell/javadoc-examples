package de.sirywell.javadoc.copiedtags;

import java.io.IOException;

public class CopiedTagsExplicitInheritDoc implements CopyableTags {

  // reusing the @return tag text from the interface
  /**
   * A doc with inheriting return tag.
   * @return prefix {@inheritDoc} suffix
   */
  @Override
  public int copyReturn() {
    return 0;
  }

  // reusing the @param tag text from the interface
  // fun fact: using {@inheritDoc} can be repeated
  /**
   * A doc with inheriting param tag.
   * @param i prefix {@inheritDoc} {@inheritDoc} suffix
   */
  @Override
  public void copyParam(int i) {
  }

  // switched param names with {@inheritDoc}
  /**
   * A doc with inherited tags.
   * @param j doc for i {@inheritDoc}
   * @param i doc for j {@inheritDoc}
   */
  @Override
  public void copyParamMultiple(int j, int i) {
  }

  // the @throws tag is copied from the interface
  /**
   * A doc with inherited throws tag.
   * @throws IOException prefix {@inheritDoc} suffix.
   */
  @Override
  public void copyThrows() throws IOException {
  }

  // nothing we haven't seen before
  @Override
  public void copyThrowsMultiple() throws IOException, ReflectiveOperationException {
  }

  // nothing we haven't seen before
  @Override
  public void doNotCopyNotDeclaredThrows() {
  }
}
