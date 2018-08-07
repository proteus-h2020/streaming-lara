/*
 * Copyright (C) 2017 The Proteus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.proteus.job.operations.lasso

object FeatureConversion {
  val observedVariables = collection.immutable.List(25, 44, 3, 26, 4, 5, 6, 15, 24, 10, 1, 8, 18, 21, 23, 30, 35)

  val conversionMapping = collection.immutable.HashMap(
    "C25y1" -> 1,
    "C25y2" -> 2,
    "C25y3" -> 3,
    "C25y4" -> 4,
    "C25y5" -> 5,
    "C44" -> 6,
    "C3" -> 7,
    "C26" -> 8,
    "C4" -> 9,
    "C5" -> 10,
    "C6" -> 11,
    "C15" -> 12,
    "C24" -> 13,
    "C10" -> 14,
    "C1y1" -> 15,
    "C1y2" -> 16,
    "C1y3" -> 17,
    "C1y4" -> 18,
    "C1y5" -> 19,
    "C1y6" -> 20,
    "C1y7" -> 21,
    "C1y8" -> 22,
    "C1y9" -> 23,
    "C1y10" -> 24,
    "C1y11" -> 25,
    "C1y12" -> 26,
    "C8y1" -> 27,
    "C8y2" -> 28,
    "C8y3" -> 29,
    "C8y4" -> 30,
    "C8y5" -> 31,
    "C8y6" -> 32,
    "C8y7" -> 33,
    "C8y8" -> 34,
    "C8y9" -> 35,
    "C8y10" -> 36,
    "C8y11" -> 37,
    "C8y12" -> 38,
    "C18y1" -> 39,
    "C18y2" -> 40,
    "C18y3" -> 41,
    "C18y4" -> 42,
    "C18y5" -> 43,
    "C18y6" -> 44,
    "C18y7" -> 45,
    "C18y8" -> 46,
    "C18y9" -> 47,
    "C18y10" -> 48,
    "C18y11" -> 49,
    "C18y12" -> 50,
    "C21" -> 51,
    "C23y1" -> 52,
    "C23y2" -> 53,
    "C23y3" -> 54,
    "C23y4" -> 55,
    "C23y5" -> 56,
    "C23y6" -> 57,
    "C23y7" -> 58,
    "C23y8" -> 59,
    "C23y9" -> 60,
    "C23y10" -> 61,
    "C23y11" -> 62,
    "C23y12" -> 63,
    "C30y1" -> 64,
    "C30y2" -> 65,
    "C30y3" -> 66,
    "C30y4" -> 67,
    "C30y5" -> 68,
    "C30y6" -> 69,
    "C30y7" -> 70,
    "C30y8" -> 71,
    "C30y9" -> 72,
    "C30y10" -> 73,
    "C30y11" -> 74,
    "C30y12" -> 75,
    "C35" -> 76
  )

  val defaultValues = collection.immutable.HashMap[Int, Double](
    1 -> 3189.888,
    2 -> 2292.732,
    3 -> 2905.604,
    4 -> 2028.754,
    5 -> 1384.5,
    6 -> 690.404,
    7 -> 1559.87,
    8 -> 1078.064,
    9 -> 9322.3,
    10 -> 9722.882,
    11 -> 9119.24,
    12 -> 9501.362,
    13 -> 10114.234,
    14 -> 8901.412,
    15 -> 1.846,
    16 -> 1.846,
    17 -> 1.846,
    18 -> 1.846,
    19 -> 1.846,
    20 -> 1.846,
    21 -> 1.846,
    22 -> 1.846,
    23 -> 1.846,
    24 -> 1.846,
    25 -> 1.846,
    26 -> 1.846,
    27 -> 138.45,
    28 -> 0,
    29 -> 0,
    30 -> 0,
    31 -> 0,
    32 -> 0,
    33 -> 0,
    34 -> 0,
    35 -> 0,
    36 -> 0,
    37 -> 0,
    38 -> 138.45,
    39 -> 55.38,
    40 -> 3.692,
    41 -> 0,
    42 -> 0,
    43 -> 0,
    44 -> 0,
    45 -> 0,
    46 -> 0,
    47 -> 0,
    48 -> 0,
    49 -> 0,
    50 -> 915.616,
    51 -> 9165.39,
    52 -> 184.6,
    53 -> 46.15,
    54 -> 0,
    55 -> 0,
    56 -> 0,
    57 -> 0,
    58 -> 0,
    59 -> 0,
    60 -> 0,
    61 -> 0,
    62 -> 0,
    63 -> 114.452,
    64 -> 40.612,
    65 -> 0,
    66 -> 0,
    67 -> 0,
    68 -> 0,
    69 -> 0,
    70 -> 0,
    71 -> 0,
    72 -> 0,
    73 -> 0,
    74 -> 0,
    75 -> 930.384,
    76 -> 2377.648
  )
}