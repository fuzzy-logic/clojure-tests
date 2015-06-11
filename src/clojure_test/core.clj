(ns clojure-test.core
  (:gen-class)
  (:require [clojure.string :as str]
            [clojure.math.combinatorics :as combo]))

(defn problem-1
  "Rotate an array of n elements to the right by k steps."
  [list k]
  (let [t (rem k (count list))
        x (if (> t 0) (- (count list) t) (- t))
        [head tail] (split-at x list)]
    (concat tail head)))

(defn problem-2
  "Given two strings w1 and w2, determine if they are isomorphic."
  [w1 w2]
  (let [fn-v (fn [v] (map #(map first %)
                   (vals
                     (group-by #(last %)
                               (map-indexed vector (seq v))))))
        word1 (fn-v w1)
        word2 (fn-v w2)]
    (= word1 word2)))

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
  (reduce max (map read-string(map #(apply str %) (combo/permutations numbers)))))

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
  "Starting with any positive integer, replace the number by the sum of the
  squares of its digits, and repeat the process until the number equals 1."
  [number]
  (let [n (map read-string (remove empty? (str/split (str number) #"")))
        y (reduce + (map #(reduce * (repeat 2 %)) n))]
    (cond (= y 1) "That right there is a good ol' happy number pardner!!"
          (= y 4) "That isnt a happy number!"
          :else (recur y))))

(defn problem-9
  "Given a triangle, find the minimum path sum from top to bottom."
  [numbers]
)