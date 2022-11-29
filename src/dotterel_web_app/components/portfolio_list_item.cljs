(ns dotterel-web-app.components.portfolio-list-item)

(defn portfolio-list-item
  [property]
  [:li
   [:div "Address: " (get property :address)]
   [:div "Tenant: " (get property :tenant)]]
  )