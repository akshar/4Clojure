(fn nth-elem
  ([coll index] (nth-elem coll index 0))
  ([coll index count]
   (if (= index count)
     (first coll)
     (nth-elem (rest coll) index (inc count)))))
