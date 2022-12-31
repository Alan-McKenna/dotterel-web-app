(ns dotterel-web-app.views.view-wrapper
  (:require
   [re-frame.core :as re-frame]
   [dotterel-web-app.subs :as subs]
   [dotterel-web-app.views.portfolio :refer [portfolio]]
   [dotterel-web-app.views.property :refer [property]]))

(defn view-wrapper []
   [:div
    (let [view (re-frame/subscribe [::subs/view])]
      (case @view
      "portfolio" [portfolio]
      "property" [property]
      )
)])