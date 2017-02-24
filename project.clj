(defproject org.clojars.featheredtoast/reloaded-repl-cljs "0.1.0"
  :description "Reloaded repl as CLJS"
  :url "https://github.com/featheredtoast/reloaded-repl-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40" :scope "provided"]
                 [com.stuartsierra/component "0.3.1"]]

  :plugins [[lein-cljsbuild "1.1.3"]]
  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds
   {:test
    {:source-paths ["src" "test"]
     :compiler {:main org.clojars.featheredtoast.reloaded-repl-cljs-test
                :output-to "resources/public/js/compiled/testing.js"
                :optimizations :none}}}})
