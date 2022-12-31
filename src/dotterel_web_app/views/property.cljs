(ns dotterel-web-app.views.property
  (:require
   [re-frame.core :as re-frame]
[dotterel-web-app.events :as events]
   ))

(defn property []
   [:div  "Hello World"
    [:input {:type "button"
             :value "Go to portfolio view"
             :on-click (fn [] (re-frame/dispatch-sync [::events/set-view "portfolio"]))}]
    ])