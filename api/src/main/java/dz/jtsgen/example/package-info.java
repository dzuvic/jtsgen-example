@TSModule(moduleName = "exampleApi", author = "Burgen Perle", customTypeMappings = {
        "java.time.LocalDate -> string",
        "java.lang.Number -> number"
})
package dz.jtsgen.example;

import dz.jtsgen.annotations.TSModule;