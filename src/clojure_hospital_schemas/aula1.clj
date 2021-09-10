(ns clojure-hospital-schemas.aula1
  (:use clojure.pprint))

(defn adiciona-paciente [pacientes paciente]
  (if-let [id (:id paciente)]
    (assoc pacientes id paciente)
    (throw (ex-info "Paciente sem id", {:paciente paciente}))))

(defn adiciona-visita
  [visitas, paciente, novas-visitas]

  )

(defn testa-uso-do-pacientes []
  (let [guilherme {:id 15 :nome "guilherme"}
        daniela {:id 20 :nome "Daniela"}
        paulo {:id 25 :nome "Paulo"}
        visitas {}
        pacientes (reduce adiciona-paciente {} [guilherme, daniela, paulo])]
    (pprint pacientes)
    (adiciona-visita visitas 15 ["01/01/2020"])
    (adiciona-visita visitas 20 ["01/02/2019", "01/01/2020"])
    (adiciona-visita visitas 15 ["01/03/2020"]))
  )

(testa-uso-do-pacientes)