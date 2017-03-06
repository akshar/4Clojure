;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (defn flatten-obj [coll]                                          ;;
;;   (if (empty? coll)                                               ;;
;;     ()                                                            ;;
;;     (if (seq? (seq (first coll)))                                 ;;
;;       (cons (flatten-obj (first coll)) (flatten-obj (rest coll))) ;;
;;       (cons (first coll) (flatten-obj (rest coll))))))            ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (defn flatten-obj2 [coll]            ;;
;;   (loop [coll coll out ()]           ;;
;;     (if( empty? coll)                ;;
;;       out                            ;;
;;       (if (seq? (seq (first coll)))) ;;
;;       )))                            ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; https://mwfogleman.github.io/posts/20-12-2014-flatcat.html
(def atom? (complement sequential?))  ;; complement seq?

(defn copied-flatten [coll]
  (let [f (first coll)
        r (rest coll)]
    (cond (empty? coll) nil
          (atom? f) (cons f (copied-flatten r))
          :else
          (concat (copied-flatten f) (copied-flatten r)))))
