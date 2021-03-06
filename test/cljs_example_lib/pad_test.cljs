(ns cljs-example-lib.pad-test
  (:require [cljs.test :refer-macros [deftest is testing run-tests]]
            [cljs-example-lib.pad :refer [left-pad right-pad]]))

(deftest left-pad-test
  (testing "2-arity version pads with spaces"
    (is (= "  foo" (left-pad "foo" 5))))
  (testing "3-arity version pads with arg"
    (is (= "+++bar" (left-pad "bar" "+" 6)))))

(deftest right-pad-test
  (testing "2-arity version pads with spaces"
    (is (= "foo  " (right-pad "foo" 5))))
  (testing "3-arity version pads with arg"
    (is (= "bar+++" (right-pad "bar" "+" 6)))))

(enable-console-print!)
