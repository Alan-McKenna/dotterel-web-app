(ns dotterel-web-app.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [dotterel-web-app.events :as events]
   [dotterel-web-app.config :as config]
   [dotterel-web-app.views.view-wrapper :refer [view-wrapper]]
   ))

(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn view-manager [root-el] 
    (rdom/unmount-component-at-node root-el)
    (rdom/render [view-wrapper] root-el)
    )

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (view-manager root-el)
    ))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
