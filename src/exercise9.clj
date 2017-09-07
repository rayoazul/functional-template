(ns exercise 9) 
(defn things [cosa]
(condp = (type cosa)
java.lang.String "Soy un String"
clojure.lang.PersistentVector "Soy un Vector"
java.lang.Long "Soy un default"
clojure.lang.PersistentArrayMap "Soy un Map")) 