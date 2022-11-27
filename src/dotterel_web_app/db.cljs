(ns dotterel-web-app.db
  (:require
   [dotterel-web-app.views.property :as property]
   ))

(def default-db
  {:portfolio [{:address "158 St Andrews Road" :tenant "Alan McKenna"} {:address "158 St Andrews Road" :tenant "Megan Durning"}]
   :view property/view})
