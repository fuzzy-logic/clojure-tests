(ns clojure-test.core-test
  (:use midje.sweet)
  (:use clojure.test)
  (:require [clojure-test.core :as core]))

<<<<<<< HEAD
(fact "array was not rotated as expected" (core/problem-1 [1 2 3 4 5 6 7 8 9] 2)
      => [8 9 1 2 3 4 5 6 7])
(fact "text was incorrectly reversed" (core/problem-4 "This is some test data")
      => "data test some is This")
(fact "version numbers were incorrectly ordered" (core/problem-3 "1.3.2" "1.3.2.1")
      => -1)
(fact "permutations of vector were incorrectly output" (core/problem-7 [0 1 2])
      => '([0 1 2] [0 2 1] [1 0 2] [1 2 0] [2 0 1] [2 1 0]))
(fact "permutations of vector were incorrectly output" (core/problem-8 19)
      => "That right there is a good ol' happy number pardner!!")
=======
(fact "array was not rotated as expected 1" (core/problem-1 [1 2 3 4 5 6 7 8 9] 2) => [8 9 1 2 3 4 5 6 7])
(fact "array was not rotated as expected 2" (core/problem-1 [1 2 3 4 5 6 7 8 9] 8) => [2 3 4 5 6 7 8 9 1])
(fact "array was not rotated as expected 3" (core/problem-1 [1 2 3 4 5 6 7 8 9] 9) => [1 2 3 4 5 6 7 8 9])
(fact "array was not rotated as expected 4" (core/problem-1 [1 2 3 4 5 6 7 8 9] 11) => [8 9 1 2 3 4 5 6 7])

(fact "text was incorrectly reversed" (core/problem-4 "This is some test data") => "data test some is This")

(fact "compare 1.3.2 & 1.3.2.1 = -1" (core/problem-3 "1.3.2" "1.3.2.1") => -1)
(fact "compare 1.2.2.1 & 1.2.2.0 = 1" (core/problem-3 "1.2.2.1" "1.2.2.0") => 1)
(fact "compare 1.2.2.1 & 1.2.2.1 = 0" (core/problem-3 "1.2.2.1" "1.2.2.1") => 0)
(fact "compare 1.2 & 1.2.0.0 = 0" (core/problem-3 "1.2" "1.2.0.0") => 0)
(fact "compare 1.2.5.4 & 1.2.4.4 = -1" (core/problem-3 "1.2.5.4" "1.2.4.4") => 1)



(fact "permutations of vector were incorrectly output" (core/problem-7 [0 1 2]) => '([0 1 2] [0 2 1] [1 0 2] [1 2 0] [2 0 1] [2 1 0]))
>>>>>>> c78197860950e50d2313e1423bf19bceddd498bb
