@TSModule(moduleName = "exampleApi", author = "Burgen Perle", outputType = OutputType.DECLARED_NAMESPACE,
        customTypeMappings = {
        "java.time.LocalDate -> string",
        "java.lang.Number -> number"
})
package dz.jtsgen.example;

import dz.jtsgen.annotations.OutputType;
import dz.jtsgen.annotations.TSModule;