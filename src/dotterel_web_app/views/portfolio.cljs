(ns dotterel-web-app.views.portfolio
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.subs :as subs]
   ))

(defn view []
  (let [portfolio (re-frame/subscribe [::subs/portfolio])]
    [:ul
     (for [property @portfolio]
       [:li
        [:div "Address: " (get property :address)]
        [:div "Tenant: " (get property :tenant)]])]))
