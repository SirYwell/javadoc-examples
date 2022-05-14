package de.sirywell.javadoc.copiedtags;

import java.io.IOException;

public interface CopyableTags {

  /**
   * @return a negative or positive integer, or zero
   */
  int copyReturn();

  /**
   * @param i must be zero or positive or negative
   */
  void copyParam(int i);

  /**
   * @param i the first value
   * @param j the second value
   */
  void copyParamMultiple(int i, int j);

  /**
   * @throws IOException if the operation fails
   */
  void copyThrows() throws IOException;

  /**
   * @throws IOException if the operation fails
   * @throws ReflectiveOperationException if the operation fails
   */
  void copyThrowsMultiple() throws IOException, ReflectiveOperationException;

  /**
   * @throws IllegalArgumentException if any of the arguments is invalid (never)
   */
  void doNotCopyNotDeclaredThrows();
}
