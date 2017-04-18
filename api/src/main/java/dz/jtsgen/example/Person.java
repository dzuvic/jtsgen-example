package dz.jtsgen.example;

import dz.jtsgen.annotations.TypeScript;

@TypeScript
public interface Person {

    // readonly
    Integer getId();

    // the display name
    String getDisplayName();
    String setDisplayName();
}
