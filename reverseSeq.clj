(defn reverse-seq [coll]
  (if (empty? coll)
    ()
    (cons (last coll) (reverse-seq (drop-last coll)))))
