package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 needle;
@Autowired
 public void getNeedle(Needle7 needle) {
    this.needle = needle;
}
@Override
public String toString() {
    return ", в яйце иголка " + needle.toString();
}
}
