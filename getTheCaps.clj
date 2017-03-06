;;convert string to a sequence and converty back to string using apply str
(defn get-caps [s]
  (apply str (filter #(Character/isUpperCase %) (seq s))))
