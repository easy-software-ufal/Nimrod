package saferefactor.localrandoop.util;

import java.util.LinkedHashSet;
import java.util.Set;

import saferefactor.localrandoop.util.ISimpleSet;

public class SimpleSet<T> implements ISimpleSet<T> {
  
  private final LinkedHashSet<T> set;

  public SimpleSet() {
    set = new LinkedHashSet<T>();
  }
  

  public void add(T elt) {
    set.add(elt);
  }

  public boolean contains(T elt) {
    return set.contains(elt);
  }

  public Set<T> getElements() {
    return set;
  }

  public void remove(T elt) {
    set.remove(elt);
  }

  public int size() {
    return set.size();
  }

}
