package saferefactor.localrandoop.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import saferefactor.localrandoop.util.ReflectionFilter;

public class EverythingAllowedFilter implements ReflectionFilter {

  public boolean canUse(Class<?> c) {
    return true;
  }

  public boolean canUse(Method m) {
    return true;
  }

  public boolean canUse(Constructor<?> m) {
    return true;
  }

}
