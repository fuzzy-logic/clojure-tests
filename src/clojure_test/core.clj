(ns clojure-test.core
  (:gen-class)
  (:require [clojure.string :as str]
            [clojure.math.combinatorics :as combo]))

(defn exp [x]
  (reduce * (repeat 2 x)))

(defn problem-1
  "Rotate an array of n elements to the right by k steps."
  [list k]
  (let [ x (if (> k 0) (- (count list) k) (- k))
        [head tail] (split-at x list)]
    (concat tail head)))

(defn problem-2
  "Given two strings w1 and w2, determine if they are isomorphic."
  [w1 w2]
  (vec (seq w1)))

(defn problem-3
  "Compare two version numbers v1 and v2.
  If v1 > v2 return 1, if v1 < v2 return -1, otherwise return 0"
  [v1 v2]
  (let [fn-v (fn [v] (map read-string (str/split v #"\D")))
        version1 (fn-v v1)
        version2 (fn-v v2)
        n (max (count version1) (count version2))]
    (compare (vec (take n (concat version1 (repeat 0))))
             (vec (take n (concat version2 (repeat 0)))))))

(defn problem-4
  "Given an input string, reverse the string word by word."
  [sentence]
  (str/join " " (reverse (str/split sentence #" "))))

(defn problem-5
  "Given a list of non negative integers, arrange them such that they form the
  largest number."
  [numbers]
)

(defn problem-6
  "Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND
  of all numbers in this range, inclusive."
  [numbers]
)

(defn problem-7
  "Given a collection of numbers, return all possible permutations."
  [numbers]
  (combo/permutations numbers))

(defn problem-8
  "Given a collection of numbers, return all possible permutations."
  [number]
  (let [n (map read-string (remove empty? (str/split (str number) #"")))
        y (reduce + (map exp n))]
    (cond (= y 1) "That right there is a good ol' happy number pardner!!"
          (= y 4) "That isnt a happy number!"
          :else (recur y))))

(defn problem-9
  "Given a triangle, find the minimum path sum from top to bottom."
  [numbers]
)