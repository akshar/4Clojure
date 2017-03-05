
;; Write a function which returns the total number of elements in a sequence
(fn count-seq
  ([coll] (count-seq coll 0))
  ([coll count]
   (if (empty? coll)
     count
     (count-seq (rest coll) (inc count)))))
