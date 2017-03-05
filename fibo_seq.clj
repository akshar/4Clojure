(fn fibo [n]
  (take n
        (map first (iterate (fn [[a b]] [b (+ a b)])  [1 1]))))





(defn lazy-seq-fibo
  ([]
   (concat [0 1] (lazy-seq-fibo 0N 1N )))
  ([a b]
   (let [n (+ a b)]
     (lazy-seq
      (cons n (lazy-seq-fibo b n ))))))
