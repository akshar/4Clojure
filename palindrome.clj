(fn pali [coll]
  (let [rev (reverse coll)]
    (= (seq rev) (seq coll))))
