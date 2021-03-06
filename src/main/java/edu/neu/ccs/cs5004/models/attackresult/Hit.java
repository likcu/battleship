package edu.neu.ccs.cs5004.models.attackresult;

import edu.neu.ccs.cs5004.models.AttackResult;

/**
 * Represents a Hit.
 *
 * @author stephenxi
 */
public class Hit implements AttackResult {

  /**
   * Creates a hit.
   */
  public Hit() {
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public int hashCode() {
    return 42;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public String toString() {
    return "Hit{}";
  }
}
