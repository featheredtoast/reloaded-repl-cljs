# reloaded-repl-cljs


[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.featheredtoast/reloaded-repl-cljs.svg)](https://clojars.org/org.clojars.featheredtoast/reloaded-repl-cljs)

A re-implementation of reloaded-repl in CLJS

## Usage

The use case for reloading is to hook into [figwheel](https://github.com/bhauman/lein-figwheel).

Add the following figwheel on-jsload to your cljs build

`:figwheel {:on-jsload "org.clojars.featheredtoast.reloaded-repl-cljs/go"}`

Use a system with [component](https://github.com/stuartsierra/component).

`(defn the-system []
  (component/system-map ...))`
  
Start the system on eval. `set-init-go!` will only call `go` the first time it is evaluated.

`(reloaded/set-init-go! #(the-system))`

Now whenever figwheel reloads code, it will also reload your components

## License

Copyright © 2016 Jeff Wong

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
