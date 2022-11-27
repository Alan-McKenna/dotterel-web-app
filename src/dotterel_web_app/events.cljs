(ns dotterel-web-app.events
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))