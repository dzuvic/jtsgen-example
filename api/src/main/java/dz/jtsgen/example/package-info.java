@TSModule(moduleName = "exampleApi", author = "Bürger Fauna", outputType = OutputType.NO_MODULE,
        customTypeMappings = {
        "java.time.LocalDate -> string",
        "java.lang.Number -> number",
        "java.util.Date -> number",
        "java.util.concurrent.Future<T> -> number<T>"
})
package dz.jtsgen.example;

import dz.jtsgen.annotations.OutputType;
import dz.jtsgen.annotations.TSModule;