(ns exercise 7)
(defn fmap [f x]
	 (if (= (type x) clojure.lang.PersistentArrayMap)(zipmap (keys x) (map inc (vals x)))(map f x)
	 )
 )