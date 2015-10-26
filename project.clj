(defproject hola-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]]
  ; Aquí indico dónde está el código en clojure. Sólo tengo que llegar
  ; hasta clj, lo de más abajo son packages.
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "1.1.0"]]
  ; Dentro de clojsbuild tengo que mostrar también el camino al código
  ; en clojurescript, igual que antes
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        ; En el output-to le indico donde quiero que me guarde
                        ; el código compulado en js y cómo se va a llamar el
                        ; archivo, hello.js en este caso
                        :compiler {:output-to "resources/public/hello.js" ; default: target/cljsbuild-main.js
                                   ;Optimizations en whitespace para poder leer
                                   ;el código resultante en js.
                                   :optimizations :whitespace
                                   :pretty-print true}}]})

;El Google Closure Compiler tiene tres modos de compilación:
; Whitespace only. :whitespace
; Simple Optimizations
; Advanced Optimizations

;La última opción puede reducir dramáticamente el tamaño del archivo pero
;el código tiene que cumplir determinados requisitos.
;Si el codigo fuente en javscript no cumple esos requisitos, no funciona.
