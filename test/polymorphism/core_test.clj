(ns polymorphism.core-test
  (:require [clojure.test :refer :all]
            [polymorphism.core :refer :all]))

(deftest test-core
  (testing "Polymorphism."
    (is (= :run-away (encounter b1 l1)))
    (is (= :mate (encounter b1 b2)))
    (is (= :eat (encounter l1 b1)))
    (is (= :fight (encounter l1 l2)))))