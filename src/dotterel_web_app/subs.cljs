(ns dotterel-web-app.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::view
 (fn [db]
   (:view db)))

(re-frame/reg-sub
 ::portfolio
 (fn [db]
   (:portfolio db)))
