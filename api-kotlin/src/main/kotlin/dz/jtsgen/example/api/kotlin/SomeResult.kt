package dz.jtsgen.example.api.kotlin

import dz.jtsgen.annotations.TypeScript

@TypeScript
class SomeResult(
         val success: Boolean,
         val message: String
)

@TypeScript
data class OtherResult(
        var pairs: List<Pair<Int,Int>>
)