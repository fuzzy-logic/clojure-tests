(ns clojure-test.core-test
  (:use midje.sweet)
  (:use clojure.test)
  (:require [clojure-test.core :as core]))

(fact "array was not rotated as expected" (core/problem-1 [1 2 3 4 5 6 7 8 9] 2) => [8 9 1 2 3 4 5 6 7])
(fact "text was incorrectly reversed" (core/problem-4 "This is some test data") => "data test some is This")
(fact "version numbers were incorrectly ordered" (core/problem-3 "1.3.2" "1.3.2.1") => -1)
(fact "permutations of vector were incorrectly output" (core/problem-7 [0 1 2]) => '([0 1 2] [0 2 1] [1 0 2] [1 2 0] [2 0 1] [2 1 0]))
