(ns dotterel-web-app.views.portfolio
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.subs :as subs]
   [dotterel-web-app.components.portfolio-list-item :refer [portfolio-list-item]]
   [dotterel-web-app.events :as events]
   ))

(defn portfolio []
  [:div
   (let [portfolio (re-frame/subscribe [::subs/portfolio])]
     [:ul
      (for [property @portfolio] (portfolio-list-item property))])
   [:input {
            :type "button"
            :value "Go to property view"
            :on-click (fn [] (re-frame/dispatch-sync [::events/set-view "property"]))
            }]])
