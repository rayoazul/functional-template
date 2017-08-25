(ns exercise 2)
(defn masGrandeQueCinco [x] (if (> x 5) true false))
(defn only-greater-than-five [x] (filter masGrandeQueCinco x) )
