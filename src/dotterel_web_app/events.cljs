(ns dotterel-web-app.events
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))


(re-frame.core/reg-event-db
 ::set-view
 (fn [db [_ new-view]]
   (assoc db :view new-view)))
