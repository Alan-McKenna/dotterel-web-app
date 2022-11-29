(ns dotterel-web-app.views.portfolio
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.subs :as subs]
   [dotterel-web-app.components.portfolio-list-item :refer [portfolio-list-item]]
   ))

(defn portfolio []
  (let [portfolio (re-frame/subscribe [::subs/portfolio])]
    [:ul
     (for [property @portfolio] (portfolio-list-item property))
     ]))
