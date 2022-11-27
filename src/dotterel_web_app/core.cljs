(ns dotterel-web-app.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [dotterel-web-app.events :as events]
   [dotterel-web-app.config :as config]
   [dotterel-web-app.subs :as subs]
   ))

(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn view-manager [root-el] 
  (let [view (re-frame/subscribe [::subs/view])]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [@view] root-el)
    ))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (view-manager root-el)
    ))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
