(ns cljs-example-lib.pad
  (:require [pad :refer [default] :rename {default pad}]))

(defn left-pad
  ([str count]
   (left-pad str " " count))
  ([str pad-str count]
   (pad count str pad-str)))

(defn right-pad
  ([str count]
   (right-pad str " " count))
  ([str pad-str count]
   (pad str count pad-str)))
