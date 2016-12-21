(ns org.clojars.featheredtoast.reloaded-repl-cljs-test
  (:require-macros [cljs.test :refer (is deftest testing)])
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [cljs.test]))

(deftest example-passing-test
  (is (= 1 1)))

(doo-tests 'org.clojars.featheredtoast.reloaded-repl-cljs-test)
